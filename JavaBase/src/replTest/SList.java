
//Create a student class that will have 
//variables as studentId, name and lastName
//constructor
//method to display students details
//
//Create a set that will store 5 different students in an order they been added to the collection.
//
//Execute method to display students details

package replTest;


public class SList {

	
	String id, name, lastName;
	
	public SList (String id, String name, String lastName){
	this.id=id;
	this.name=name;
	this.lastName=lastName;
	}
	
	public void  method () {
		System.out.println("Student Details: "+name+" "+lastName+" whis id: "+id);
	}


}
