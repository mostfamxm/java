
public class Bus {
	private String plateNum;
	private int seatNum;
	public Bus (String plateNum,int seatNum) {
		setPlateNumber(plateNum);
		setSeatsNumber(seatNum);
	}
	
	public Bus( Bus Other ) {
		this(Other.plateNum,Other.seatNum);
		
	}
	
	public String toString() {
		return "platenumber="+plateNum+"seats="+seatNum;
		
	}
	public String getNumber() {
		return plateNum;
	}
	public void setPlateNumber(String plateNum) {
		this.plateNum=plateNum;
		
	}	
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatsNumber(int seatsNum) {
		if(seatsNum < 0) {
			this.seatNum=0;
		}
		this.seatNum=seatsNum;
	}

}
