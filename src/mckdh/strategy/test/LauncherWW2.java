package mckdh.strategy.test;

import mckdh.strategy.airplane.AirplaneAntiFirst;
import mckdh.strategy.airplane.AirplaneAntiStrategySecond;
import mckdh.strategy.airplane.AirplaneAntiStrategyThird;
import mckdh.strategy.airplane.AirplaneGoodStrategy;
import mckdh.strategy.airplane.cockpit.PowerArmorOnDefaultCockpit;
import mckdh.strategy.pilot.Pilot;
import mckdh.strategy.pilot.anti.PilotAntiFirst;
import mckdh.strategy.pilot.anti.PilotAntiSecond;
import mckdh.strategy.pilot.anti.PilotAntiThird;

public class LauncherWW2 {

	public static void main(String[] args) {
		
		//1. if문으로 조종석 구분
		AirplaneAntiFirst airplaneAntiFirst = new AirplaneAntiFirst();
		PilotAntiFirst pilotAntiFirst = new PilotAntiFirst(airplaneAntiFirst);
		pilotAntiFirst.intoCockpit();
		pilotAntiFirst.checkAirplane();
		pilotAntiFirst.turnOnAirplane();
		pilotAntiFirst.increaseSpeedOnLand();
		pilotAntiFirst.takeOff();
		pilotAntiFirst.wheelIntoBody();

		// 2. 개별로 개발하고 직접 의존
		AirplaneAntiStrategySecond airplaneAntiSecond = new AirplaneAntiStrategySecond("초 강력 장갑 조종석");
		PilotAntiSecond pilotAntiSecond = new PilotAntiSecond(airplaneAntiSecond);
		pilotAntiSecond.intoCockpit();
		pilotAntiSecond.checkAirplane();
		pilotAntiSecond.turnOnAirplane();
		pilotAntiSecond.increaseSpeedOnLand();
		pilotAntiSecond.takeOff();
		pilotAntiSecond.wheelIntoBody();

		// 3. 상속을 썼지만 직접 의존
		AirplaneAntiStrategyThird airplaneAntiThird = new AirplaneAntiStrategyThird("초 강력 장갑 조종석");
		PilotAntiThird pilotAntiThird = new PilotAntiThird(airplaneAntiThird);
		pilotAntiThird.intoCockpit();
		pilotAntiThird.checkAirplane();
		pilotAntiThird.turnOnAirplane();
		pilotAntiThird.increaseSpeedOnLand();
		pilotAntiThird.takeOff();
		pilotAntiThird.wheelIntoBody();

		// 4. Strategy pattern
		AirplaneGoodStrategy airplane = new AirplaneGoodStrategy(new PowerArmorOnDefaultCockpit());
		Pilot pilot = new Pilot(airplane);
		pilot.intoCockpit();
		pilot.checkAirplane();
       	pilot.turnOnAirplane();
        pilot.increaseSpeedOnLand();
        pilot.takeOff();
        pilot.wheelIntoBody();
	}

}
