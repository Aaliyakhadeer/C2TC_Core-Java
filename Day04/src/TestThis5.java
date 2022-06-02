class Demo 
{
	
	Demo(){
	this(10);
		
		System.out.println("hello a");
	}
    Demo(int x)
{
	//this();
	System.out.println(x);
}
}
public class TestThis5
{
	public static void main(String args[])
	{
		Demo a=new Demo();
	}

}
