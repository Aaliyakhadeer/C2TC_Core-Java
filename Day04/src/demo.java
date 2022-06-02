public class demo {
	void m()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		demo obj=new demo();
		System.out.println(obj);
		obj.m();
		}
	}
	


