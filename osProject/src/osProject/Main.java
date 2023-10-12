package osProject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;
import osProject.Process;




public class Main {
	public static void main(String args[])
	{
		
		Process p1 = new Process("P1", 3, 0); 
		Process p2 = new Process("P2", 2, 0);
		Queue <Process> readyQue = new LinkedList<>();
		readyQue.add(p1);
		readyQue.add(p2);
		
		Scheduler sch = new Scheduler(SchedulerType.FCFS, readyQue);
		// when press run button
		{
			Thread thread1 = new Thread(() -> sch.schedule());
			thread1.start();
		}
		
		// when press add process button
		{
			Process p3 = new Process("P3", 4, 0);
			Thread thread2 = new Thread(() -> sch.addProcess(p3));
			thread2.start();
		}
		/*
		 * sch.schedule();
		 * 
		 * LocalDateTime dateTime1 = LocalDateTime.now(); LocalDateTime dateTime2 =
		 * LocalDateTime.of(2023, 4, 12, 23, 28, 0);
		 * 
		 * Duration duration = Duration.between(dateTime1, dateTime2); long seconds =
		 * duration.getSeconds(); int sec = (int)seconds; sch.addProcess(new
		 * Process("P3", 4, sec));
		 * 
		 * System.out.println("Difference in seconds: " + seconds);
		 */

	}
}
