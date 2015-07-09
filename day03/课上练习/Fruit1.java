package 课上练习;

public class Fruit1 {
public String toString(){
	return "水果";
}

	/**
	 * @param args
	 */


}
class apple extends Fruit1{
	public String toString(){
		return "苹果";
	}
}
class mango extends Fruit1{
	public String toString(){
		return "芒果";
	}
}
class juicer{
	public void juice(Fruit1 fruit){
		System.out.println("榨"+fruit+"汁");
		
	}
	public static void main(String[]args){
		juicer j=new juicer();
		Fruit1 f=new apple();
		j.juice(f);
	}

}