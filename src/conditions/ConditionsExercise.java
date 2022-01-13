package conditions;
//mostfa mhameed 315255604
/*
 * This class exercises Java Conditions.
 * Make sure you DO NOT CHANGE the methods signatures.
 * You must only change the content of the methods
 */

public class ConditionsExercise {
	
	public boolean isXGreaterThanY (int x, int y) {
		//if x is bigger than y we return true else we return false
	if(x>y) {
		return true;
	}
		return false;
	
	}
	
	public boolean isOdd (int x) {
		//check if x is a double number if yes we return false if not we return true
		if(x%2==0)
		{
			return false;
		}
		return true;
	}
	
	public boolean isXDividedByY (int x, int y) {
		//we check if x is divede by y by using % if yes return true else return false
		if(x%y==0) {
			return true;
		}
		return false;
	}
	
	public int getBigger (int x, int y) {
		//check if they are equal and return any one u said so i returned x
		if(x==y) {
			return x;}
		//check if x bigger than y if yes the return x else return y
		else {if(x>y)
			return x;
		}
		return y;
	}
	
	public String compare (int x, int y) {
		//creating strings and entering values into them
		String equal="both equal" ,fbiger="the first is bigger" ,sbigger="the second is bigger";
		//check if x equals to y if yes return "bothe equal" else we check if x is bigger than y if yes we return the first is bigger else we return the second is bigger
		if(x==y) {
		return equal;
		}else {
			if(x>y) {
				return fbiger;
			}
			
		}
		
		return sbigger;
	}

	public boolean isNull (String text) {
		//in the practice class she showed us how we make strings i serched on google for more info
		//here we check if the text is null (NULL)if yes we return true else we return false
		if(text==null){
			return true;
		}
		
		return false;
	}
	
	public boolean areXAndYBothGreaterThanZ (int x, int y, int z) {
		//check if the x and y both bigger than z return true any thing else return false
		if(x>z&&y>z) {
			return true;
		}
		return false;
	}
	
	public boolean isXInRange (int x, int minInclusive, int maxInclusive) {
		//check if the x bigger than our min number and smaller than our max number
		if(x>minInclusive&&x<maxInclusive) {
			return true;
		}
		return false;
	}
	
	public boolean isLeapYear (int year){
	
		if(year%4==0) {
			//if the year divided  by 100 then enter and check if it's diveded by 400
			if(year%100==0) {
				//check if the year diveded by 400 if yes return true else false
				if(year%400==0) 
					return true;
					
				else
	
				return false;}
		//if the year is under 400 and divided by 4	
		else return true;	}
		
	
	
	
			
		
		return false;
	}
}
