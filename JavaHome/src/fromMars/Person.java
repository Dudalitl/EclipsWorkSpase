package fromMars;

public class Person {
		  private String firstname;
		  private String lastname;
		  private int birtmonth;
		  private int birthday;
		  private int birthyear;
		  private String ssn;
		  Person(){
		    this.firstname="John";
		    this.lastname="Doe";
		    this.birtmonth=10;
		    this.birthday=25;
		    this.birthyear=1900;
		    this.ssn="123-45-6789";
		  }
		 public String getFirstname() {
			 return firstname;
		 }
		 public String getLastname() {
			 return lastname;
		 }
		 public String getSsn() {
			 return ssn; 
		 }
		 public int getBirtmonth() {
			 return birtmonth;
		 }
		 public int getBirthday() {
			 return birthday;
		 }
		 public int getBirthyear() {
			 return birthyear;
		 }
		 public String getBirthData(int birtmonth, int birthday, int birthyear) {
			 this.birthday=birthday;
			 this.birthyear=birthyear;
			 this.birtmonth=birtmonth;
			 String str=(birtmonth+"/"+birthday+"/"+birthyear);
			 return str;
		 }

} 
		  
		  
		  
	
