package com.hkbk.abstraction;
  abstract class dress
{
	abstract void type();
}
class menswear extends dress{
	void type()
	{
		System.out.print("its mens wear");
	}
}
public class Main2 {
        public static void main(String args[])
        {
        	menswear coat = new menswear();
        	coat.type();
        }
}
