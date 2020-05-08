package replTest;


//Create a custom Exception class
//In main class create a method that will check students grade
//if students grade is >90 then below exception should be thrown
//if students grade is below 90 print "You are a great student"
//
//In main method calls method gradeCheck and handle an Exception
//
//Expected Output:
//SyntaxStudentException: You are an exceptionally awesome student


  class SyntaxStudentException extends RuntimeException{
	  
	  
	  
  }

public class repl210 {
	public static void gradeChek(int num) {
		if (num>90) {
			throw new SyntaxStudentException();
		}if (num<90) {
			System.out.println("You are a great student");
		}
		
	}

	public static void main(String[] args) {
		

	}

}
