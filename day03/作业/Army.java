package ��ҵ;

public class Army {
Weapon[] w;
int count=0;
public Army(int num){
  w=new Weapon[num];
  }
public void addWeapon(Weapon weapon){
	if (count<w.length){
		w[count++]=weapon;
		System.out.println("��������������");
    }		
}
public void attackall(){
	System.out.println("һ����"+w.length+"������");
	System.out.println("ȫ����ʼ����");
	for(int i=0;i<count;i++){
		w[i].attack();
    }
}
public void moveall(){
	System.out.println("ȫ����ʼ�ƶ�");
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
