package com.basics;

public class BasicImplementsRunnableAnonymous {
	public static void main(String args[]) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Thread is running");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
