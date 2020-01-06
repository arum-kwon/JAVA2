package co.arum.classArray;

public class Friend {
	String name;
	String tel;
	
	public Friend(){
	}
	public Friend(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String toString() {
		return "Name:" + name + " | Tel:" + tel; 
	}
}
