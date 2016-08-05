package com.basics;

public class BasicExtendsThreadAnonymous {
	public static void main(String args[]) {
		Thread thread = new Thread() {
			public void run() {
				System.out.print("Thread is running");
			}

		};
		thread.start();
	}
}
