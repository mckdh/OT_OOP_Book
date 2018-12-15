package mckdh.templatemethod.pilot.anti;


public class BomberPilotAnti extends PilotAnti {
	
	public BomberPilotAnti(Airplane airplane) {
		super(airplane);
	}
	
	// 파일럿이 비행기를 체크 합니다.
	@Override
	public boolean checkAirplane() {
		
		checkResult = airplane.checkAirplane();

		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return checkResult;
	}
	
	// 비행기 시동을 켭니다.
	@Override
	public boolean turnOnAirplane() {

		turnOnResult = airplane.turnOnAirplane();
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return turnOnResult;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	@Override
	public boolean increaseSpeedOnLand() {
		
		increaseSpeedResult = airplane.increaseSpeedOnLand();

		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return increaseSpeedResult;
	}
	
	// 이륙을 합니다. 
	@Override
	public String takeOff() {
		String status = "";
		 
		status = airplane.takeOff();
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return status;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	@Override
	public String wheelIntoBody() {
		String status = "";
		
		status = airplane.wheelIntoBody();
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return status;
	}
}
