package task;

import java.util.Scanner;

public class Fibo
	{
	public static void main(String args[])
	{
	int a=0,b=1,c,sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Range");
	n=sc.nextInt();
	System.out.println("Fibo Serise :-"+a+","+b);
	for(int i=1;i<n;i++)
	{
	c=a+b;
	a=b;
	b=c;
	System.out.println(","+c);
	}
	}

}