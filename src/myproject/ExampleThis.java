package myproject;

class Student2{
	int rollno;
	String name;
	float fee;
	Student2(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}
public class ExampleThis {

	public static void main(String[] args) {
		Student2 s1=new Student2(111,"Noob",50000f);
		Student2 s2=new Student2(114,"Anshul",40000f);
		s1.display();
		s2.display();
		

	}

}
