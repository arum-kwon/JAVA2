package co.arum.mainapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.arum.lecture01.Member;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		Date date = new Date();
		
//		member.id = "mine";
//		member.name = "tidy";
//		member.eDate = date;
//		member.address = "Degu";
//		member.tel = "010-1100-0011";
		member.setAge(103);
		member.toString();
		member.toPrint();
	}

}
