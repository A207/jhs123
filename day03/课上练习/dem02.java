package 课上练习;

public class dem02 {
	int age;
	static String name="张三";
    void hello(){
	   System.out.println("hello...");
   }
     static void hi(){
    	 System.out.println("hi...");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
dem02 d=new dem02();
/*
 * 当我们调用属性和方法时，一定是调用某个实例对象的实现或方法
 d.age=10;
d.hello();*/
dem02.hi();
System.out.println(dem02.name);
d.hi();
	}

}
