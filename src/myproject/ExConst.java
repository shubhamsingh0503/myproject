package myproject;

public class ExConst {
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
      
		ExConst ec1=new ExConst();
		ExConst ec2=new ExConst();
		ec1.display();
		ec2.display();
		
	}

}
