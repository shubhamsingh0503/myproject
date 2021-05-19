package myproject;

class Student1{
	int rollno;
	String name;
	static String college="GEU";//static variable
	static void change() {
		college="DIT";
	}
	Student1(int r,String n){
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class StaticVariableMethod {

	public static void main(String[] args) {
		Student1.change();//calling change method
		Student1 s1=new Student1(11,"Ash");
		Student1 s2=new Student1(22,"kammo");
		Student1 s3=new Student1(33,"mani");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
