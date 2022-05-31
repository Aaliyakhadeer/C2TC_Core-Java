package day02;

public class company {
	String name;
	public static void main(String[] args) {
		company c = new company();
		company c1 = c;
		c1.name = "C2TC";
		c.name = "hkbk";
		System.out.println(c.name);
	}

}
