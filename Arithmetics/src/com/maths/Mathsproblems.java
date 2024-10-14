package com.maths;

public class Mathsproblems {
	public int sum(int a,int b) {
		int c;
		 c =a+b;
		System.out.println("summation of no. a and b ="+ c );
		return c;
	}
	
	public int subs(int p,int q) {
		int r;
		r = p-q;               
		System.out.println("substraction of no. p and q ="+ r);
		return r;
	}
	public int  multi(int c,int d) {
		int e = c * d;
		System.out.println("multiplication of no. c and d ="+ e); 
		return e;
	}
	public void div(int div1,int div2) {
		int division = div1/div2;
		System.out.println("Final result of ((((10+2)-2)+2)*2)/2)---> "+ division);
	}
	public static void main(String [] args) {
		Mathsproblems math = new Mathsproblems();
		int sumation = math.sum(10, 2);
		int substraction=math.subs(sumation, 2);
		int sumation2 =math.sum(substraction, 2);
		int multiply =math.multi(sumation2, 2);
	     math.div(multiply, 2);
	}

}
