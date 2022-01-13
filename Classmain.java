package opreatingSystem;

public class Classmain {

	public static void main(String[] args) {

		Thread w1= new Thread( new Worker("1","1"));
		Thread w2= new Thread( new Worker("2","2"));
		Thread w3= new Thread( new Worker("3","3"));
//		w1.print(); //prints when the thread starts and ends
//   	w2.print();
//		w3.print();
		
		w1.start(); //it's activates the run method
		w2.start();
		w3.start();
	try {	
		w1.join();//the method join starts an object and ends it in an order
		w2.join();
		w3.join();
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	Worker.printArray();
	}

}
