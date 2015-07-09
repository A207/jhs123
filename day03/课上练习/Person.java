package 课上练习;

public class Person {
String name;
int age;
String add;
//无参调用
//Person (){
	//System.out.println("Person的默认方法被调用");	
//}
Person(String n,int a, String ad){
	name=n;
	age=a;
	add=ad;
}
void introduce(){
	System.out.println("大家好，我叫"+name+"我家在"+add);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("jim",23,"USA");
//p.name="张三";
//p.age=20;
//p.add="USA";

p.introduce();

	}

}
