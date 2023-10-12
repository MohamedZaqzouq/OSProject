package osProject;

import java.util.LinkedList;
import java.util.Queue;

public class Subject {
	Queue <Process> readyQueue = new LinkedList<>();
	boolean state;
	
	public Subject()
	{
		this.state = false;
	}
	
	void setState(boolean state)
	{
		this.state = state;
		notifyListeners();
	}
	boolean getState()
	{
		return this.state;
	}
	
	void add(Process process)
	{
		readyQueue.add(process);
	}
	
	void notifyListeners() {
		
	}
}
