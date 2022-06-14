package com.cg.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterClass {

	public static void main(String[] args) {
		 LocalDateTime myDateObj =LocalDateTime.now();
		 System.out.println("before formatting what is your date?"   +myDateObj);
		 DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("E, dd-MMM-yyyy HH:mm:ss");//providing the date and time pattern
		 String formattedDate =myDateObj.format(myFormatobj);
		 System.out.println("after fromatting what is your date?"  +formattedDate );
	}

}
