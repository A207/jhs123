package 课上练习;

public class fruit {
String name;
int price;
String add;
//friut(){}
fruit(String n,int p,String a){
	name=n;
	price=p;
	add=a;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fruit apple=new fruit("苹果",12,"山东");
System.out.println(apple.name+"  "+apple.price+  "  "+apple.add);

	}

}
