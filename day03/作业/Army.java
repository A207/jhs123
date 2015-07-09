package 作业;

public class Army {
Weapon[] w;
int count=0;
public Army(int num){
  w=new Weapon[num];
  }
public void addWeapon(Weapon weapon){
	if (count<w.length){
		w[count++]=weapon;
		System.out.println("武器加入武器库");
    }		
}
public void attackall(){
	System.out.println("一共有"+w.length+"个武器");
	System.out.println("全部开始攻击");
	for(int i=0;i<count;i++){
		w[i].attack();
    }
}
public void moveall(){
	System.out.println("全部开始移动");
	for(int i=0;i<count;i++){
		w[i].move();
	}
}
	public static void main(String[] args) {
		  Army ar=new Army(5);
		  ar.addWeapon(new Tank());
		  ar.addWeapon(new Tank());
		  ar.addWeapon(new Flighter());
		  ar.addWeapon(new Flighter()); 
		  ar.addWeapon(new WarShip());
		  ar.attackall();
		  ar.moveall();
	}

}
