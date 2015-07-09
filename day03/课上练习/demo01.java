package 课上练习;

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
		this(name,age);//调用两个参数的构造方法
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

/*1.this可以用在构造方法内部，用来区分成员变量和局部变量
 * 2.this可以用于调用构造方法，减少冗余（必须为第一句）
 * 3.this可以用于调用成员属性和成员方法
 */



