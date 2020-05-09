package replTest;


import java.io.FileNotFoundException;

//Create a method that will not be handling exception and throwing it at caller.
//In main method call method and handle the exception.
//
//Expected Output:
//java.io.FileNotFoundException:  (No such file or directory)

public class repl208 {
	
	public static void display() throws FileNotFoundException {
		throw new FileNotFoundException("(No such file or directory)");
		
	}
		
	public static void main(String[] args) {
		try {
		display();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		

	}

}
