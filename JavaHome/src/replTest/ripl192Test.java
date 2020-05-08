package replTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ripl192Test {

	public static void main(String[] args) {
		
		Set<EmployeeRepl192>setList=new LinkedHashSet();
		
		setList.add(new EmployeeRepl192("John Doe", 123456789, 80000.0));
		setList.add(new EmployeeRepl192("Jane Smith", 987654321, 90000.0));
		setList.add(new EmployeeRepl192("Jackie Chan", 0, 1000000.0));
		
		Iterator<EmployeeRepl192> it=setList.iterator();
		while(it.hasNext()) {
			EmployeeRepl192 obj=it.next();
			
			System.out.println(obj.getName());
			System.out.println(obj.getSsn());
			System.out.println(obj.getSalary());
		}
		
	}

}
