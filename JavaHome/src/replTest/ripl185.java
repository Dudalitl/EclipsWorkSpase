package replTest;

import java.util.LinkedList;

public class ripl185 {
	
	
	public int method (int num) {
		int res=0;
		for(int j=1; j<=num; j++) {
			if (num%j==0) {
				res++;
				}	
			}	if (res!=2) {
				num=0;
			}return num;
			}
			
			
		
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		for (int i=1; i<100; i++) {
			ripl185 obj=new ripl185();
			if (obj.method(i)!=0) {
				list.add(obj.method(i));
			};
		
		}System.out.println(list);
	}
}


