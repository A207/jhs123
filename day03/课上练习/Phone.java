package 课上练习;

public class Phone {

	/**
	 * @param args
	 */
	String name;
	String brand;
	int price;
	void call(){
		System.out.println("打电话。。。");
		
	}
	void sendmes(){
		System.out.println("发短信。。。");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone p=new Phone();
p.name="note";
p.brand="三星";
p.price=998;
System.out.println(p.name);
p.call();
	}

}
