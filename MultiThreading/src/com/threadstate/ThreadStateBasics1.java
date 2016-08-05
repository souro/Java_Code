package com.threadstate;

class MyThread extends Thread{
	private String threadName;
	MyThread(String threadName){
		this.threadName = threadName;
		System.out.println(threadName + " is getting created now Running thread is " + Thread.currentThread().getName());
	}
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is running");
		for(int i=1;i<=4;i++){
			try {
				System.out.println(Thread.currentThread().getName() + " is running and value of i is " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(threadName + " is interrupted now Running thread is " + Thread.currentThread().getName());
			}
		}
		System.out.println( threadName + " is exiting now Running thread is " + Thread.currentThread().getName());
	}
	public void start(){
		System.out.println(threadName + " Created now Running thread is " + Thread.currentThread().getName());
		super.start();
	}
}
public class ThreadStateBasics1 {
	public static void main(String args[]){
		MyThread myThread1 = new MyThread("Thread-0");
		myThread1.start();
		MyThread myThread2 = new MyThread("Thread-1");
		myThread2.start();
		MyThread myThread3 = new MyThread("Thread-3");
		myThread3.start();
		MyThread myThread4 = new MyThread("Thread-4");
		myThread4.start();
	}
}
