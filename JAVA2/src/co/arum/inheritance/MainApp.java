package co.arum.inheritance;

public class MainApp {

	public static void main(String[] args) {
		Car bus = new Bus();
//		Car taxi = new Taxi();
		bus.car();
//		bus.speed();
		
		Bus bus1 = new Bus();
		bus1.car();
		bus1.speed();
		
		Car taxi = new Taxi();
		taxi.car();
	}

}
