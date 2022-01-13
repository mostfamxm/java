package opreatingSystem;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassMain2 {

	public static void main(String[] args) {
	ExecutorService executer= Executors.newFixedThreadPool(5);
	for(int i=0;i<50;i++) {
		
		Runnable worker=new Worker2(i+"");
		executer.execute(worker);
	}
	
	executer.shutdown();
	while(! executer.isTerminated());
	System.out.println("finished all threads");
	
	
	
	
	}

}
