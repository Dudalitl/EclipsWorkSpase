package replTest;

import java.util.LinkedList;

public class list188 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		int num1=0;
		int num2=1;
		list.add(0);
		list.add(1);
		for (int i=2; i<10;i++) {
			int num3=num1+num2;
			list.add(num3);
			num1=num2;
			num2=num3;
		}
		System.out.println(list);
		for(Integer c:list) {
			System.out.print(c+" ");
		}

	}

}
