package com.priority;

class PrioThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "is running with Priority: "+ Thread.currentThread().getPriority());
	}
}

public class PriorityBasics {
	public static void main(String args[]){
		PrioThread thread1 = new PrioThread();
		PrioThread thread2 = new PrioThread();
		PrioThread thread3 = new PrioThread();
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread3.setName("thread3");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
