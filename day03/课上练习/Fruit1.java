package ������ϰ;

public class Fruit1 {
public String toString(){
	return "ˮ��";
}

	/**
	 * @param args
	 */


}
class apple extends Fruit1{
	public String toString(){
		return "ƻ��";
	}
}
class mango extends Fruit1{
	public String toString(){
		return "â��";
	}
}
class juicer{
	public void juice(Fruit1 fruit){
		System.out.println("ե"+fruit+"֭");
		
	}
	public static void main(String[]args){
		juicer j=new juicer();
		Fruit1 f=new apple();
		j.juice(f);
	}

}