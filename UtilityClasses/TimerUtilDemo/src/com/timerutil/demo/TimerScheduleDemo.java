package com.timerutil.demo;

import java.util.Timer;
import java.util.TimerTask;

class scheduleTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("Run ~");
	}
}

public class TimerScheduleDemo {
	public static void main(String args[]){
		scheduleTask task = new scheduleTask();
    	Timer timer = new Timer();
    	timer.schedule(task, 100,6000);
	}
}
