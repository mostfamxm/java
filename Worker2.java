package opreatingSystem;

import java.awt.desktop.ScreenSleepEvent;

public class Worker2 implements Runnable {
	
	private String nameT;
	
	public Worker2(String nameT) {
	
		this.nameT = nameT;
	}
	
	@Override
	public void run() {
		System.out.println("start  :"+Thread.currentThread().getName()+"command  = "+nameT);

	try {
		Thread.currentThread().sleep(2000);
		
	}catch(InterruptedException e){
		e.printStackTrace();
		
	}
	
		System.out.println("stop  :"+Thread.currentThread().getName()+"command  = "+nameT);
	}
	
	
	
	

	public String getNameT() {
		return nameT;
	}

	public void setNameT(String nameT) {
		this.nameT = nameT;
	}
	

}
