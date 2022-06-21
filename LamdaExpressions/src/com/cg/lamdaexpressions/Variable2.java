package com.cg.lamdaexpressions;
/*interface addition{
	public int add(int a, int b);
}
public class Variable2 {

	public static void main(String[] args) {
		 addition d2=(int a, int b)-> (a+b);{
              System.out.println(d2.add(10, 20));};
	}

}*/
interface addition{
	public int add();
}
public class Variable2 {
	public static void main(String[] args) {
		addition d2=()-> (10+20);{
			System.out.println(d2.add());};
		}
	}
