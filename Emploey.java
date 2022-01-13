
public class Emploey {
	
	 private static int strWorkerNum=1000; 
	 private int workerNum;
	 private String name;
	public enum department {Qa,RnD,Finance};
	 private int workYears;
	 private department Department;
	

	 
	 
	 



	public Emploey( String name, int workYears, department department) {
		
		
		this.name = name;
		this.workYears = workYears;
		this.Department = department;
		workerNum = strWorkerNum++;
	}


	public static int getStrWorkerNum() {
		return strWorkerNum;
	}
	 
	
	 public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWorkYears() {
		return workYears;
	}
	
	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}
	
	public int getWorkerNum() {
		return workerNum;
	}


	@Override
	public String toString() {
		return "Emploey [workerNum=" + workerNum + ", name=" + name + ", workYears=" + workYears + ", Department="
				+ Department + "]";
	}


	
	
	 
	 
	
	

}
