package com.threadstate;
class Thread1 extends Thread{
	public void run(){
		for(int i=1;i<=4;i++){
			if(i==1)
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"is running with value of i : " + i);
		}
		System.out.println("Exit from "+ Thread.currentThread().getName());
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=1;i<=4;i++){
			if(i==2)
				yield();
			System.out.println(Thread.currentThread().getName()+"is running with value of i : " + i);
		}
		System.out.println("Exit from "+ Thread.currentThread().getName());
	}
}
class Thread3 extends Thread{
	public void run(){
		for(int i=1;i<=4;i++){
			if(i==3)
				stop();
			System.out.println(Thread.currentThread().getName()+"is running with value of i : " + i);
		}
		System.out.println("Exit from "+ Thread.currentThread().getName());
	}
}
public class ThreadStateBasics2 {
	public static void main(String args[]){
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		System.out.println("Thread-0 is getting started");
		thread1.start();
		System.out.println("Thread-1 is getting started");
		thread2.start();
		System.out.println("Thread-2 is getting started");
		thread3.start();
	}

}
