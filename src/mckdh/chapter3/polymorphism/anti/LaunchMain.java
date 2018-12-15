package mckdh.chapter3.polymorphism.anti;

public class LaunchMain {
	public static void main(String[] args) {
		Pilot defaultPilot = new Pilot("프로펠러 비행기");
		defaultPilot.intoAirplane();
		
		defaultPilot = new Pilot("제트 비행기");
		defaultPilot.intoAirplane();
		
		defaultPilot = new Pilot("스텔스 비행기");
		defaultPilot.intoAirplane();
	}
}
