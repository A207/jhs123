package ������ϰ;

public class demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person1 person=new Person1("jim",20,"USA");
	     person.introduce();
		}
	}
	class Person1{
		String name;
		int age;
		String address;
		public Person1(){}
		public Person1(String name,int age){
			this.name=name;
			this.age=age;
		}
		public Person1(String name,int age,String address){
		this(name,age);//�������������Ĺ��췽��
		this.address=address;
	}
		void hello(){
			System.out.println("hello..");
		}
	    void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress"+this.address);
		this.hello();	
		}
	}

/*1.this�������ڹ��췽���ڲ����������ֳ�Ա�����;ֲ�����
 * 2.this�������ڵ��ù��췽�����������ࣨ����Ϊ��һ�䣩
 * 3.this�������ڵ��ó�Ա���Ժͳ�Ա����
 */



