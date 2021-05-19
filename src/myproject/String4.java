package myproject;

public class String4{

	public static void main(String[] args) {
		String s="        JoHnWiCk";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s);
		System.out.println(s.trim());
		
		System.out.println(s.startsWith("Jo"));
		System.out.println(s.endsWith("k"));
		
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(12));
		
		System.out.println(s.length());
		
		int a=10;
		String s1=String.valueOf(a);
		System.out.println(s1+10);
		
		String s2="He is Thor.Thor is god a of thunder";
		String replaces=s2.replace("Thor","loki");
		System.out.println(replaces);
		
		


	}

}

