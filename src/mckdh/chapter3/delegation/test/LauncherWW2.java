package mckdh.chapter3.delegation.test;

import mckdh.chapter3.delegation.airplane.Airplane;
import mckdh.chapter3.delegation.pilot.Pilot;
import mckdh.chapter3.delegation.stealth.NormalStealth;
import mckdh.chapter3.delegation.stealth.NotDoStealth;
import mckdh.chapter3.delegation.stealth.UltraStealth;

public class LauncherWW2 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new UltraStealth());
		airplane.doingStealthFunction();
		
		Airplane airplane2 = new Airplane(new NormalStealth());
		airplane2.doingStealthFunction();
		
		Airplane airplane3 = new Airplane(new NotDoStealth());
		airplane3.doingStealthFunction();
		
		
//		Pilot pilot = new Pilot();
//		pilot.intoCockpit();
//		pilot.checkAirplane();
//       	pilot.turnOnAirplane();
//        pilot.increaseSpeedOnLand();
//        pilot.takeOff();
//        pilot.wheelIntoBody();
	}

}
