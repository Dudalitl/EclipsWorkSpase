package replTest;

import java.util.HashSet;
import java.util.Set;

//Create a set collection in which you do not want to preserve or sort the order and add below values to it. 
//
//Red
//Pink
//Yellow
//White
//Black
//
//Print set collection
//And get total number of colors available in the set
public class Set191 {

	public static void main(String[] args) {
		
		Set<String> setList=new HashSet();
		setList.add("Red");
		setList.add("Pink");
		setList.add("Yellow");
		setList.add("White");
		setList.add("Blask");
		
		System.out.println(setList);
		System.out.println(setList.size());

	}

}
