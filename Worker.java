package opreatingSystem;

public class Worker  implements Runnable  {
	
	private String nameT;
	private String idT;
	private static String []arr=new String[10];
	private static  int freePlace=0;
	
	public Worker(String nameT, String idT) {
		
		this.nameT = nameT;
		this.idT = idT;
	}

	public String getNameT() {
		return nameT;
	}

	public void setNameT(String nameT) {
		this.nameT = nameT;
	}

	public String getIdT() {
		return idT;
	}

	public void setIdT(String idT) {
		this.idT = idT;
	}
	public void print() {
		System.out.println("start"+nameT);
		try {
			Thread.currentThread().sleep(2000);
		}catch(InterruptedException i){
			i.printStackTrace();
		}	
		System.out.println("ends"+nameT);
	}
	public void run() {
		
		System.out.println("start"+nameT);
		for(int i=0; i<3;i++) {
		while (addPlace(nameT)==false) {
			addPlace(nameT);
		}	
		}
		
		System.out.println("ends"+nameT);
	
	}
	public static void printArray() {
		
			for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}
	public  static int getRandomNumber(int min, int max) {
		    return (int) ((Math.random() * (max - min)) + min);
		}
		public static synchronized boolean addPlace(String nameT) {//synchronized is a work we use when want to enter one thread after another in an order	
		 int freePlace
		 = (int) Math.random()*10;
			if(arr[freePlace]==null) {
			arr[freePlace]=nameT;
				freePlace++;
				return true;
			}
			return false;
			}//and after we made this method we dont need to use try/catch in our run method
		
	}
	
	
	


