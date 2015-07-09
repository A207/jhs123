package øŒ…œ¡∑œ∞;

public class demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new B();
new B();

	}
}

 class B{
	static{
		System.out.println(1);
	}
	{
		System.out.println(2);
		
	}
	B(){
		System.out.println(3);
		
	}
}