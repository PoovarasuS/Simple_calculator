package sample1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Simple_Calculator {
	public static long getinput1() {
	    Scanner sc=new Scanner(System.in);
	    try {
	    	System.out.println("Enter the first number:");
	    	long a=sc.nextLong();
	    	return a;
	    }catch(InputMismatchException e) {
	    	System.out.println("Please enter the whole number only!!");
	    }
		return Simple_Calculator.getinput1();
	}
	public static long getinput2() {
	    Scanner sc=new Scanner(System.in);
	    try {
	    	System.out.println("Enter the second number:");
	    	long b=sc.nextLong();
	    	return b;
	    }catch(InputMismatchException e) {
	    	System.out.println("Please enter the whole number only!!");
	    }
		return Simple_Calculator.getinput2();
	}
	public static String getoperator() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the arithmetic operator");
		String s=sc.next();
		return s;
	}
	public static void Calculate(long n1, long n2, String n3) {
		if(n3.equals("+")) {
			System.out.println("The sum of "+n1+" and "+n2+" is:"+(n1+n2));
			Simple_Calculator.calc(n1,n2,n3);
		}
		else if(n3.equals("-")) {
			System.out.println("The subraction of "+n1+" and "+n2+" is:"+(n1-n2));
			Simple_Calculator.calc(n1,n2,n3);
		}
		else if(n3.equals("*")) {
			System.out.println("The multiplication of "+n1+" and "+n2+" is:"+(n1*n2));
			Simple_Calculator.calc(n1,n2,n3);
		}
		else if(n3.equals("/")) {
			System.out.println("The division of "+n1+" and "+n2+" is:"+(n1/n2));
			Simple_Calculator.calc(n1,n2,n3);
		}else {
			System.out.println("Please enter +,-,*,/  any of these operator");
			Simple_Calculator.calc(n1,n2,n3);
		}
	}
	private static void calc(long n1,long n2,String n3) {
		n1=Simple_Calculator.getinput1();	
		n2=Simple_Calculator.getinput2();
		n3=Simple_Calculator.getoperator();
		Simple_Calculator.Calculate(n1,n2,n3);
	}	
	public static void main(String[] args) {
		long n1=0;long n2=0;String n3="";
		Simple_Calculator.calc(n1,n2,n3);
	}	
	}
