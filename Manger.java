
public class Manger {
	
	private Drive [] allDrive;
	private Line [] allLines;
	private int numOfLines;
	private int numOfDrives;
	private Company company;
	
	
	
	public Manger( String companyName) {
		
		this.allDrive = new Drive[1000];
		this.allLines = new Line[50];
		this.numOfLines = 0;
		this.numOfDrives = 0;
		this.company = new Company (companyName);
	}
	public boolean addDrives(Drive d) {
		if(numOfDrives==allDrive.length)
			return false;
		allDrive[numOfDrives++]=d;
		return true;	
	}
	public boolean addLines(Line l) {
		if(numOfLines==allLines.length)
			return false;
		allLines[numOfLines++]=l;
		return true;	
	}
	
	

}
