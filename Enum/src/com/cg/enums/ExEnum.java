package com.cg.enums;

public class ExEnum {
	enum Day{
		Sunday, Monday , Tuesday, Wednesday,thursday,Friday,Saturday
	}
public static void main(String[] args) {
	Day day = Day.Saturday;
	switch(day) {
	case Sunday:
		System.out.println("moving towards Monday");
		//Break;
	case Friday:
		System.out.println("Hurrah!! weekend");
		//Break;
		
		default:
		System.out.println("other day");
}
}
}
