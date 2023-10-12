package osProject;
import java.util.LinkedList;
import java.util.Queue;
import java.time.LocalDate;

enum SchedulerType {FCFS, SJFP, SJFNP, PRP, PRNP, RR}

public class Scheduler {
	SchedulerType type;
	Queue<Process> readyQueue;
	boolean addingProcess = false;
	LocalDate runTime;
	int quantum;
	
	public Scheduler(SchedulerType type,int quantum, Queue<Process> readyQueue) {
		super();
		this.type = type;
		this.readyQueue = readyQueue;
		this.runTime = LocalDate.now();
	}
	
	public Scheduler(SchedulerType type, Queue<Process> readyQueue) {
		super();
		this.type = type;
		this.readyQueue = readyQueue;
		this.runTime = LocalDate.now();
	}
	
	// thread 2
	public void addProcess(Process process)
	{
		System.out.println("addProcess started.");
		readyQueue.add(process);
		addingProcess = true;
		System.out.println(addingProcess);
		System.out.println("addProcess stopped.");
	}
	// thread 1
	public void schedule() {
	    switch (type) {
	        case FCFS:
	            FCFS();
	            break;
	        case SJFP:
	        	SJFP();
	            break;
	        case SJFNP:
	        	SJFNP();
	            break;
	        case PRP:
	        	PRP();
	            break;
	        case PRNP:
	        	PRNP();
	            break;
	        case RR:
	        	RR();
	            break;
	        default:
	            break;
	    }
	}
	
	void FCFS()
	{
		// Implementation
	}
	
	void SJFP()
	{
		while (!addingProcess)
		{
			// implementation
			// if(burst == 0)
				// dequeue
				// break
		}
		if(addingProcess)
		{
			addingProcess = false;
			SJFP();
		}
	}
	
	void SJFNP()
	{
		// Implementation
	}
	
	void PRP()
	{
		while (!addingProcess)
		{
			// implementation
			// if(burst == 0)
				// break;
		}
		if(addingProcess)
		{
			addingProcess = false;
			SJFP();
		}
	}
	
	void PRNP() {
		
	}
	
	void RR() {
		
	}
	
}
