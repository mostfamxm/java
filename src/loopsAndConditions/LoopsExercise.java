package loopsAndConditions;

import java.time.LocalDate;

public class LoopsExercise {
	public int sumAllFromMinToMax (int min, int max) {
		/* the method returns the sum of all numbers between min and max, including min and max
		 * 
		 * examples:
		 *   when called with (0,2) the method returns the result of (0+1+2) which is the integer 3
		 *   when called with (9,11) the method returns the result of (9+10+11) which is the integer 30
		 *   when called with (11,9) the method returns the result of (9+10+11) which is the integer 30
		 */
		int sum=0;
		if(max>min) {
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		 }
		else {
			for(int i=max;i<=min;i++) {
			sum+=i;
		}
			
		}
		return sum;
	}
	
	public int sumSevensFromMinToMax (int min, int max) {
		/* the method returns the sum of the numbers than divide by 7 between min and max, including min (if it divides by 7) and max (if it divides by 7) 
		 * 
		 * examples:
		 *   when called with (0,8) the method returns the result of (7) which is the integer 7
		 *   when called with (0,15) the method returns the result of (7+14) which is the integer 21
		 *   when called with (7,21) the method returns the result of (7+14+21) which is the integer 42
		 */
		int sum=0;
		if(min<max){
		for(int i=min;i<=max;i++) {
			if (i%7==0) {
				sum+=i;
				
			}
			
		}
		}
		else {
			for(int i=max;i<=min;i++) {
			if (i%7==0) {
				sum+=i;
				
			}
			
		}
			
			
		}
		return sum;
	}

	public long fibonacci (int index){
		/* the method returns an element of the Fibonacci series.
		 * Fibonacci series first number is 1 (index=0)
		 * The next element (index = 1) is also 1
		 * The next element is the sum of its previous two elements
		 * 
		 * if the index is negative, the method returns 0.0
		 * 
		 * examples:
		 *   fibonacci(0) returns 1.0
		 *   fibonacci(1) returns 1.0
		 *   fibonacci(2) returns 2.0
		 *   fibonacci(3) returns 3.0
		 *   fibonacci(4) returns 5.0
		 *   fibonacci(5) returns 8.0
		 *   fibonacci(6) returns 13.0
		 *   fibonacci(7) returns 21.0
		 * 
		 */
		long nig= 0,c=0,eqz=1,sum=0;
		
		if(index<0) {
			return nig;
		}else {
			if(index==0||index==1) {
				return eqz;
			}
			
			
		}
		long i=1;
		for( i=1;i<=index;i++) {
			nig=c;
			c=eqz;
			eqz=c+nig;
			sum+=nig;
			
			
		}
		sum++;
		return sum;
	}
	
	/* the method returns a date in the following format "dd/MM/yyyy" of the next meeting,
	 * assuming the current date, is defined by:
	 * 		day (1-31 day of month)
	 * 		month (1-12 the current month)
	 * 		year (current year)
	 * and that the next meeting occurs in durationInDays days
	 * Note that the value durationInDays may be negative
	 * 
	 * When calculating the result date String you must take into consideration the number of days per each month (your method may define a relevant value in advance).
	 * You should also take into consideration the February may contain either 28 days on non-leap years and 29 days on leap years.
	 * A leap year is a year which divides by 4, but is not divided by 100.
	 * Note that years that divide by 400 are leap years.  
	 * 
	 * If any of the day, month, or year values is illegal (e.g. day is 32, or month is 0) the method returns the String "illegal day"
	 *  
	 * examples:
	 *    with the arguments (1, 1, 2018, 5) the method returns "06/01/2018"
	 *    with the arguments (1, 1, 2018, -5) the method returns "27/12/2017"
	 *    with the arguments (1, 1, 2000, 60) the method returns "01/03/2000"
	 *    with the arguments (1, 1, 2001, 60) the method returns "02/03/2000"
	 *    with the arguments (32, 1, 2001, 60) the method returns "illegal day"
	 *    with the arguments (1, 0, 2001, 60) the method returns "illegal day"
	 *    with the arguments (29, 2, 2001, 60) the method returns "illegal day"
	 */
	public String nextMeeting (int day, int month, int year, int durationInDays){
	
		String str1="illegle date";
		
	if(month>12 || month<=0) {
		return str1;	
	}
	if((month==1 || month==3 || month==5 || month==7 || month==8 || month== 10 || month==12)&&(day>31 || day<1)) {
		return str1;
	}else
	 if(( month==4 || month==6 || month==9 || month==11 )&&(day>30 || day<1)) {
		 
		return str1; 
		 
	 }else if ((year%4==0 || year%100!=0 || year%400==0)) {
		 if(day>29 || day<1)
	 return str1;
	 }else if(day>28 || day<1) {
		 return str1;
	 }
	if(durationInDays>=0) {
		for(int i=0;i<durationInDays;i++) {
			day++;
			if((month==1 || month==3 || month==5 || month==7 || month==8 || month== 10 || month==12)&&(day>31)) {
				day=1;
				month++;
				
			if(month>12) {
				month=1;
				year++;
			}
			
}else if(( month==4 || month==6 || month==9 || month==11 )&&(day>30)) {
			day=1;
			month++;	
}else if(month==2 &&(year%4==0 || year%100!=0 || year%400==0)&&(day>29)) {
			day=1;
			month++;
}else if(month==2 && !(year%4==0 || year%100!=0 || year%400==0)&&(day>28)) {
		day=1;
		month++;
		}	
		}	
		}
	else {
		for(int i=0;i>durationInDays;i--) {
			day--;
			if(day<1) {
			if((month==2 || month==4 || month==6 || month==8 || month==9 || month== 11 || month==1)) {
				day=31;
				month--;
				
			if(month<1) {
				month=12;
				year--;
			}
			
}else if(( month==5|| month==7 || month==10 || month==12 )) {
			day=30;
			month--;	
}else if(month==3 &&(year%4==0 || year%100!=0 || year%400==0)) {
			day=29;
			month--;
}else if(month==3 && !(year%4==0 || year%100!=0 || year%400==0)) {
		day=28;
		month--;
		}	
	  }	
	}	
} 

	String result="";
	
	if(day<10) {
		result=result+"0";
		}
		result=result+day+"/";
		if(month<10) {
			result=result+"0";
			}
			result=result+month+"/";	
System.out.println();

result=result+year;
return result;


	}
}

