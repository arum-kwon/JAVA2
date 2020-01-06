package co.arum.classArray;

public class UniversityFriend extends Friend {
	String major;
	
	public UniversityFriend() {
		super();
	}
	public UniversityFriend(String name, String tel, String major) {
		super(name, tel);
		this.major = major;
	}
	@Override
	public String toString() {
		return "Name:" + name + " | Tel:" + tel +" | Major:" + major; 
	}
	
	
}
