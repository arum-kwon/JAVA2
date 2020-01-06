package co.arum.classArray;

public class CompanyFriend extends Friend {
	String dept;
	
	public CompanyFriend() {
		super();
	}
	public CompanyFriend(String name, String tel, String dept) {
		super(name, tel);
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Name:" + name + " | Tel:" + tel +" | Dept=" + dept;
	}
	
}
