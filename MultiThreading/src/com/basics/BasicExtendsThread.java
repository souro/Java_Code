package com.basics;

class MyThread extends Thread{
	public void run(){
		System.out.print("Thread is running");
	}
	
}
public class BasicExtendsThread {
 public static void main(String args[]){
	 MyThread myThread = new MyThread();
	 myThread.start();
 }
}
