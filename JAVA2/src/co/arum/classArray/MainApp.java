package co.arum.classArray;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] friendAry= new Friend[10];
		friendAry[0] = new Friend("ggomachingu","053-1234-1234");
		friendAry[1] = new Friend("nextdoorchingu","053-2200-3300");
		friendAry[2] = new Friend("firstfloorchingu","053-1000-2000");
		friendAry[3] = new UniversityFriend("channdonggi","010-8888-8888", "horti");
		friendAry[4] = new UniversityFriend("midonggi","010-8080-8800", "horti");
		friendAry[5] = new UniversityFriend("teidonggi","010-0808-8080", "Forest");
		friendAry[6] = new CompanyFriend("KAR","010-7171-2222","Lsa");
		friendAry[7] = new CompanyFriend("HAN","010-2020-3344","Ssa");
		friendAry[8] = new CompanyFriend("LER","010-7531-4685","Tsa");
		
		for(Friend f: friendAry) {
			if(f != null) {
				System.out.println(f);
			}
		}
	}

}
