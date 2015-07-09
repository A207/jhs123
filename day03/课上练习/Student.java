package 课上练习;

public class Student {
int num;
String name;
String add;
void introduce(){
	System.out.println("大家好，我的学号是"+num+"我叫"+name+("我家在"+add));
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student I=new Student();
I.name="贾华松";
I.add="河北";
I.num=2012214233;
I.introduce();

	}

}
