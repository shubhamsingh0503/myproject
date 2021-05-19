package myproject;

public class ExceptionExample {
	public static void main(String[] args)
	{
		try {
			int d=40/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
