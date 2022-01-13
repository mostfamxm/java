package conditions;


import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		ConditionsExercise exercise = new ConditionsExercise();
		
		try (Scanner scanner = new Scanner(System.in)){
			String option = null;
			int x, y, z;
			String text;
			do {
				try {
					System.out.println("choose an option:");
					
					System.out.println("\t(Q) to quit");
					System.out.println("\t(1) isXGreaterThanY()");
					System.out.println("\t(2) isOdd()");
					System.out.println("\t(3) isXDividedByY()");
					System.out.println("\t(4) getBigger()");
					System.out.println("\t(5) compare()");
					System.out.println("\t(6) isNull()");
					System.out.println("\t(7) areXAndYBothGreaterThanZ()");
					System.out.println("\t(8) isXInRange()");
					
					System.out.println("\t(y) isLeapYear()");
					
					option = scanner.nextLine();
					switch (option) {
						case "1":
							System.out.println("isXGreaterThanY(x, y)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("y:");
							y = new Integer(scanner.nextLine());
								
							System.out.println("isXGreaterThanY(" + x + ", " + y + ") = " + exercise.isXGreaterThanY(x, y));
							break;

						case "2":
							System.out.println("isOdd(x)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							System.out.println("isOdd(" + x + ") = " + exercise.isOdd(x));
							break;
							
						case "3":
							System.out.println("isXDividedByY(x, y)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("y:");
							y = new Integer(scanner.nextLine());
								
							System.out.println("isXDividedByY(" + x + ", " + y + ") = " + exercise.isXDividedByY(x, y));
							break;

						case "4":
							System.out.println("getBigger(x, y)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("y:");
							y = new Integer(scanner.nextLine());
								
							System.out.println("getBigger(" + x + ", " + y + ") = " + exercise.getBigger(x, y));
							break;

						case "5":
							System.out.println("compare(x, y)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("y:");
							y = new Integer(scanner.nextLine());
								
							System.out.println("compare(" + x + ", " + y + ") = " + exercise.compare(x, y));
							break;

						case "6":
							System.out.println("isNull(text)");
							System.out.println("text (type NULL for null):");
							text = scanner.nextLine();
							if ("NULL".equals(text)) {
								text = null;
							}
								
							System.out.println("isNull(" + text + ") = " + exercise.isNull(text));
							break;

						case "7":
							System.out.println("areXAndYBothGreaterThanZ(x, y, z)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("y:");
							y = new Integer(scanner.nextLine());
							
							System.out.println("z:");
							z = new Integer(scanner.nextLine());
							
							System.out.println("areXAndYBothGreaterThanZ(" + x + ", " + y + ", " + z + ") = " + exercise.areXAndYBothGreaterThanZ(x, y, z));
							break;
							
						case "8":
							System.out.println("isXInRange(x, min, max)");
							System.out.println("x:");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("min:");
							y = new Integer(scanner.nextLine());
							
							System.out.println("max:");
							z = new Integer(scanner.nextLine());
							
							System.out.println("isXInRange(" + x + ", " + y + ", " + z + ") = " + exercise.isXInRange(x, y, z));
							break;
						
						case "y":
						case "Y":
							System.out.println("isLeapYear (int year)");
							System.out.println("year");
							x = new Integer(scanner.nextLine());
								
							
							System.out.println("isLeapYear (" + x + ") = " + exercise.isLeapYear(x));
							break;

						case "q":
						case "Q":
							option = "quit";
							break;
						default:
							break;
					}
				}catch(Exception e){
					System.err.println("Error while typing input");
				}
				if (!"quit".equalsIgnoreCase(option)) {
					System.out.println("type enter to continues...");
					scanner.nextLine();
				}
				System.out.println();
			}while (!"quit".equalsIgnoreCase(option));
			
			System.out.println("bye bye");
		}
	}
}
