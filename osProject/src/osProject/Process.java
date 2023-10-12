package osProject;

public class Process {
	String name;
	int burstTime;
	int arrivalTime;
	int turnaroundTime;
	int waitingTime;
	int priority;
	
	
	public Process(String name, int burstTime, int arrivalTime, int priority) {
		super();
		this.name = name;
		this.burstTime = burstTime;
		if (arrivalTime < 0)
			this.arrivalTime = 0;
		else
			this.arrivalTime = arrivalTime;
		this.priority = priority;
	}


	public Process(String name, int burstTime, int arrivalTime) {
		super();
		this.name = name;
		this.burstTime = burstTime;
		if (arrivalTime < 0)
			this.arrivalTime = 0;
		else
			this.arrivalTime = arrivalTime;
		this.priority = -1;
	}


	public int getTurnaroundTime() {
		return turnaroundTime;
	}


	public void setTurnaroundTime(int turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}


	public int getWaitingTime() {
		return waitingTime;
	}


	public void setWaitingTime() {
		this.waitingTime = this.getTurnaroundTime() - this.arrivalTime;
	}
	
}
