package myproject;

abstract class Bank
{
	abstract int getRateofInterest();
}
class Sbi extends Bank
{
	int getRateofInterest() {
		return 7;
	}
}
class Pnb extends Bank{
	int getRateofInterest() {
		return 8;
	}
}
public class ExampleAbstraction {

	public static void main(String[] args) {
		Bank b;
		b=new Sbi();
		System.out.println("Interest is:"+b.getRateofInterest()+"%");
		b=new Pnb();
		System.out.println("Interest is:"+b.getRateofInterest()+"%");
		

	}

}
