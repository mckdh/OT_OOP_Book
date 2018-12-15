package mckdh.templatemethod.test;

import mckdh.templatemethod.airplane.cockpit.PowerArmorOnDefaultCockpit;
import mckdh.templatemethod.pilot.FightPilot;
import mckdh.templatemethod.pilot.Pilot;
import mckdh.templatemethod.pilot.anti.BomberPilotAnti;
import mckdh.templatemethod.pilot.anti.PilotAnti;

public class LauncherWW2 {

	public static void main(String[] args) {

		// 1. 나쁜 패턴
		mckdh.templatemethod.pilot.anti.Airplane antiAirplane = new mckdh.templatemethod.pilot.anti.Airplane(); 
		BomberPilotAnti pilotAnti = new BomberPilotAnti(antiAirplane);
		pilotAnti.intoCockpit();
		pilotAnti.checkAirplane();
		pilotAnti.turnOnAirplane();
		pilotAnti.increaseSpeedOnLand();
		pilotAnti.takeOff();
		pilotAnti.wheelIntoBody();

		// 2. 좋은 패턴
		mckdh.templatemethod.airplane.Airplane airplane = new mckdh.templatemethod.airplane.Airplane(new PowerArmorOnDefaultCockpit());
		Pilot pilot = new FightPilot(airplane);
		pilot.takeOffProcess();
		
	}

}
