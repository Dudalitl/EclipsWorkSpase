package fromMars;

public class Degree {
	
	public void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}
class Bachelors extends Degree{
	public void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Masters extends Degree{
	public void getPrerequisite() {
		
	}
}
