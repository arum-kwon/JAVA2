package co.arum.inheritance;

public class Car {
	public int chair;  //의자수
	public String engine; //엔진마력
	
	public Car() {
	}
	public void run() {
		System.out.println("Running");
	}
	public void stop() {
		System.out.println("Stop!");
	}
	public void car() {
		run();
		stop();
	}
	
}
