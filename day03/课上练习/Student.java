package ������ϰ;

public class Student {
int num;
String name;
String add;
void introduce(){
	System.out.println("��Һã��ҵ�ѧ����"+num+"�ҽ�"+name+("�Ҽ���"+add));
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student I=new Student();
I.name="�ֻ���";
I.add="�ӱ�";
I.num=2012214233;
I.introduce();

	}

}
