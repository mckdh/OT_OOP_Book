package mckdh.strategy.pilot.anti;

import mckdh.strategy.airplane.AirplaneAntiStrategyThird;

public class PilotAntiThird {
	protected AirplaneAntiStrategyThird airplane = null;
	protected boolean checkResult;
	protected boolean turnOnResult;
	protected boolean increaseSpeedResult;
	
	public PilotAntiThird(AirplaneAntiStrategyThird airplane) {
		this.airplane = airplane;
	}
	
	// 파일럿이 비행기(조종석)에 올라탄다.
	public AirplaneAntiStrategyThird intoCockpit() {
		
		return airplane;
	}
	
	// 파일럿이 비행기를 체크 합니다.
	public boolean checkAirplane() {
		
		checkResult = airplane.checkAirplane();
		
		return checkResult;
	}
	
	// 비행기 시동을 켭니다.
	public boolean turnOnAirplane() {

		if(checkResult) { // 비행기 점검이 정상이면 
			turnOnResult = airplane.turnOnAirplane();
		}
		
		return turnOnResult;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	public boolean increaseSpeedOnLand() {
		
		if(turnOnResult) { // 비행기 시동 켠 결과가 정상이면 
			increaseSpeedResult = airplane.increaseSpeedOnLand();
		}
		
		return increaseSpeedResult;
	}
	
	// 이륙을 합니다. 
	public String takeOff() {
		String status = "";
		
		if(increaseSpeedResult) {
			status = airplane.takeOff();
		}
		
		return status;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	public String wheelIntoBody() {
		String status = "";
		
		if(increaseSpeedResult) {
			status = airplane.wheelIntoBody();
		}

		return status;
	}
}
