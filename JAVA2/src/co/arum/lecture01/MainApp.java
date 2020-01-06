package co.arum.lecture01;

import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member();
		Date date = new Date();
		
		member.id = "sitici";
		member.name = "tan";
		member.eDate = date;
		member.address = "Degu";
		member.tel = "010-1100-0011";
		
		member.toString();
		member.toPrint();
	}

}
