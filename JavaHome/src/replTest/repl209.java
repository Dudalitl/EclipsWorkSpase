package replTest;

//Create a method that will do temperature check.
//Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"
//
//In Main method call the method and handle an Exception
//
//Expected Output: 
//java.lang.RuntimeException: It is freezing

public class repl209 {
	
	public static void tempChek(int num) {
		if(num<32) {
			throw new RuntimeException("It is Freezing");
		}else {
			System.out.println("temperatur is positive");
		}
	}

	public static void main(String[] args) {
		
		try {
		tempChek(31);
		}catch(RuntimeException ae) {
			System.out.println(ae);
		}
	}

}
