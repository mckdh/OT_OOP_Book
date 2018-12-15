package mckdh.chapter3.polymorphism;

public class LaunchMain {
	public static void main(String[] args) {
		
		Pilot defaultPilot = new Pilot(new DefaultAirplane());
		defaultPilot.intoAirplane();
		
		Pilot propellerPilot = new Pilot(new PropellerAirplane());
		propellerPilot.intoAirplane();
		
		Pilot jetPilot = new Pilot(new JetAirplane());
		jetPilot.intoAirplane();
		
		Pilot stealthPilot = new Pilot(new StealthAirplane());
		stealthPilot.intoAirplane();
		
		Pilot pilot = new Pilot(new DefaultAirplane());
		pilot.intoAirplane();
		
		pilot.setAirplane(new PropellerAirplane());
		pilot.intoAirplane();

		pilot.setAirplane(new StealthAirplane());
		pilot.intoAirplane();
		
		pilot.setAirplane(new JetAirplane());
		pilot.intoAirplane();
		
	}
}
