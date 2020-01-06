package co.arum.abstrackclass;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal rabit = new Rabit();
		rabit.eat();
		rabit.run();
		
		Animal bird = new Bird();
		bird.eat();
		bird.run();
		
		Bird bird1 = new Bird();
		bird1.run();
	}
}
