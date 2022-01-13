import java.time.LocalDate;

public class Drive {
private LocalDate dateTime;
private Line lineNum;
private Bus assignBus;

public Drive(LocalDate dateTime, Line lineNum, Bus assignBus) {
	
	this.dateTime = dateTime;
	this.lineNum = lineNum;
	this.assignBus = assignBus;
}
public LocalDate getDateTime() {
	return dateTime;
}
public void setDateTime(LocalDate dateTime) {
	this.dateTime = dateTime;
}
public Line getLineNum() {
	return lineNum;
}


public void setLineNum(Line lineNum) {
	this.lineNum = lineNum;
}
public Bus getAssignBus() {
	return assignBus;
}
public void setAssignBus(Bus assignBus) {
	this.assignBus = assignBus;
}
	@Override
public String toString() {
	return "Drive [dateTime=" + dateTime + ", lineNum=" + lineNum + ", assignBus=" + assignBus + "]";

	}



}
