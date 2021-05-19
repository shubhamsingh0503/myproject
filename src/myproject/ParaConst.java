package myproject;

public class ParaConst {
	int id;
	String name;
	
	ParaConst(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ParaConst pc1=new ParaConst(123,"ash");
		ParaConst pc2=new ParaConst(234,"mash");
		
		pc1.display();
		pc2.display();
		
		
		
	}

}
