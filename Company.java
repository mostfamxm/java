import java.util.Arrays;

public class Company {
	private Bus [] allbus;
	private String name;
	private int NumOfBuses;
	
    	public  Company (String name) {
		this.name = name;
		this.allbus= new Bus[100];
		this.NumOfBuses=0;
    	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bus[] getAllbus() {
		return allbus;
	}
	public int getNumOfBuses() {
		return NumOfBuses;
	}
	public boolean addBus (Bus b) {
		if(this.NumOfBuses < this.allbus.length) {
			this.allbus[this.NumOfBuses]=b;
			this.NumOfBuses++;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("company name"+name);
		sb.append("\nhas "+NumOfBuses+" buses: \n");
		for(int i=0;i<NumOfBuses;i++) {
			sb.append(allbus[i].toString());
		}
		
		return "Company [allbus=" + Arrays.toString(allbus) + ", company name=" + name + ", Num Of Buses=" + NumOfBuses + "]";
	}
	public boolean removeBus(String lP) {
		
		for(int i=0; i<this.NumOfBuses;i++) {
			if(this.allbus[i].getNumber().equals(lP)) {
				allbus[i]=allbus[NumOfBuses-1];
				this.NumOfBuses--;
				return true;
			}
		}
		return false;
			
		
	}
	

}
