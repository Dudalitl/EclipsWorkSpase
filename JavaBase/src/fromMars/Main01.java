package fromMars;
class Main01 {
	  public static void main (String[] args){
	    Person obj=new Person();
	    obj.getBirthData(obj.getBirtmonth(), obj.getBirthday(), obj.getBirthyear());
	    System.out.println(obj.getFirstname());
	    System.out.println(obj.getLastname());
	    System.out.println(obj.getBirthData(obj.getBirtmonth(), obj.getBirthday(), obj.getBirthyear()));
	    System.out.println(obj.getSsn());
	  }

	}