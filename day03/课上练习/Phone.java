package ������ϰ;

public class Phone {

	/**
	 * @param args
	 */
	String name;
	String brand;
	int price;
	void call(){
		System.out.println("��绰������");
		
	}
	void sendmes(){
		System.out.println("�����š�����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone p=new Phone();
p.name="note";
p.brand="����";
p.price=998;
System.out.println(p.name);
p.call();
	}

}
