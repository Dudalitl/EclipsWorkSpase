package replTest;
public class repl207 {
	public static void main(String[] args) {
			  int[] array={1, 2, 3, 4};
			  //System.out.println(array[4]);
			  try{
			  System.out.println(array[4]);
			  }catch(ArrayIndexOutOfBoundsException e){
			   e.printStackTrace();
			  }
			  
			  }
			}