package co.arum.lecture01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
	String id;
	String name;
	Date eDate;
	String address;
	String tel;

	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		System.out.println("ID:" + id + ", AGE:" + age);
		return null;
	}
	public void toPrint() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("NAME:" + name + " | eDate:" + eDate + " | address:" + address + " | tel:" + tel);
	}
}
