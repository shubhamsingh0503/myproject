package myproject;

public class ConstOver {
	int id,age;
	String name;
	
	ConstOver(int i,String n){
		id=i;
		name=n;
	}
	ConstOver(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		ConstOver co1=new ConstOver(22,"amit");
		ConstOver co2=new ConstOver(45,"rit",55);
		co1.display();
		co2.display();
	}

}
