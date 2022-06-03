 package com.hkbk.abstraction;

abstract class Lion 
{
	public abstract void sound();

}
public class Main1 extends Lion
{
	public void sound() 
	{
		System.out.println("Roar");
	}
	public static void main(String[] args)
	{
		Lion obj = new Main1();
		obj.sound();
}
}