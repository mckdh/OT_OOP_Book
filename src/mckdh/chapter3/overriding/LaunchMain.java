package mckdh.chapter3.overriding;

public class LaunchMain {
	public static void main(String[] args) {
		
		DefaultAirplane dAirplane1= new DefaultAirplane();
		dAirplane1.airplaneFeature();

		DefaultAirplane dAirplane2= new JetAirplane();
		dAirplane2.airplaneFeature();

		DefaultAirplane dAirplane3= new StealthAirplane();
		dAirplane3.airplaneFeature();
		
		JetAirplane dAirplane4= new JetAirplane();
		dAirplane4.airplaneFeature();
		
		StealthAirplane dAirplane5= new StealthAirplane();
		dAirplane5.airplaneFeature();

	}
}
