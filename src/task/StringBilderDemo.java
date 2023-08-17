package task;

import org.testng.Assert;

public class StringBilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strb=new StringBuilder();
		
		System.out.println(strb.capacity());
		strb.append("MadaM");
		System.out.println(strb);
		System.out.println(strb.charAt(2));
		//strb.replace(0, 0, "'");
		System.out.println(strb);
		strb.reverse();
		System.out.println(strb);
		//strb.replace(0, 0, "'");
		System.out.println(strb);
		
		

	}

}
