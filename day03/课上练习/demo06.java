package ¿ÎÉÏÁ·Ï°;

public class demo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(A.instance.num2);
A a=new A(1);
System.out.println(a.num2);
	}

}
class A{
	static  A instance=new A(1);
	static int num1=5;
	int num2;
	A(int num3){
		num2=num1-num3;
		}
	}
	