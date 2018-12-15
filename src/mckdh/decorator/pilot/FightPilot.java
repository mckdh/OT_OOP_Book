package mckdh.decorator.pilot;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.airplanestate.AirplaneState;

public class FightPilot extends Pilot {

	public FightPilot(Airplane airplane) {		
		super(airplane);
	}

	// 파일럿이 비행기(조종석)에 올라탄다.
	@Override
	public AirplaneState intoCockpit() {
		// 현재 비행기 상태를 리턴한다. 
		return airplane.getAirplaneState();
	}

	// 비행기 시동을 켭니다.
	@Override
	public boolean turnOnAirplane() {

		boolean turnOnResult = airplane.turnOnAirplane();
		
		// 그외 이 파일럿 클래스 특성에 맞는 다른 로직 구현 함..
			
		return turnOnResult;
	}
	
	// 파일럿이 비행기를 체크 합니다.
	@Override
	public boolean checkAirplane() {
		
		boolean checkResult = airplane.checkAirplane();
		
		// 그외 이 파일럿 클래스 특성에 맞는 다른 로직 구현 함..

		return checkResult;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	@Override
	public boolean increaseSpeedOnLand() {
		
		boolean increaseSpeedResult = airplane.increaseSpeedOnLand();

		// 그외 이 파일럿 클래스 특성에 맞는 다른 로직 구현 함..
		
		return increaseSpeedResult;
	}
	
	// 이륙을 합니다. 
	@Override
	public boolean takeOff() {
		boolean result = airplane.takeOff();
		
		// 그외 이 파일럿 클래스 특성에 맞는 다른 로직 구현 함..
		
		return result;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	@Override
	public AirplaneState wheelIntoBody() {
		airplaneState = airplane.wheelIntoBody();

		// 그외 이 파일럿 클래스 특성에 맞는 다른 로직 구현 함..
		
		return airplaneState;
	}
}
