package ������ϰ;

public class Person {
String name;
int age;
String add;
//�޲ε���
//Person (){
	//System.out.println("Person��Ĭ�Ϸ���������");	
//}
Person(String n,int a, String ad){
	name=n;
	age=a;
	add=ad;
}
void introduce(){
	System.out.println("��Һã��ҽ�"+name+"�Ҽ���"+add);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("jim",23,"USA");
//p.name="����";
//p.age=20;
//p.add="USA";

p.introduce();

	}

}
