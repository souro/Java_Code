package com.basics;

public class ThreadName {
	public static void main(String args[]){
		System.out.println("Current Running Thread Name: "+Thread.currentThread().getName());
		for (int i=1; i<=10; i++){
			new Thread("Thread "+i){
				public void run(){
					System.out.println("Current Running Thread Name: "+Thread.currentThread().getName());
				}
			}.start();
		}
	}
}
