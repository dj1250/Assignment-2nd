package com.maths;

public class math2 {
	public int multi(int a,int b) {
		int c = a*b;
		//System.out.println("multiplicatio of no. a and b "+c);
		return c;
	}
	public int subs(int x,int y) {
		int z = x-y;
		//System.out.println("substraction of no. x and y "+ z);
		return z;
	}
	public int sum(int p,int q) {
		int r = p + q;
		//System.out.println("summation of no. p and q "+ r);
		return r;
	}
	public void division(int div1,int div2) {
		int result =div1/div2;
		System.out.println("Result of (((((10*2)-2)-2)+2)/2) will be  "+result );
		
	}
	
	public static void main(String[] args) {
		math2 m = new math2();
		int multiplication = m.multi(10, 2);
		int substract1 = m.subs(multiplication, 2);
		int substract2= m.subs(substract1, 2);
		int summation = m.sum(substract2, 2);
		 m.division(summation, 2);

	}

}
