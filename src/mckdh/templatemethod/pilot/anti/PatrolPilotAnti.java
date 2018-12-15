package mckdh.templatemethod.pilot.anti;

public class PatrolPilotAnti extends PilotAnti {
	
	public PatrolPilotAnti(Airplane airplane) {
		super(airplane);
	}

	// 파일럿이 비행기(조종석)에 올라탄다.
	@Override
	public Airplane intoCockpit() {
		airplane = new Airplane();
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..
	
		return airplane;
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

		if(checkResult) { // 비행기 점검이 정상이면 
			turnOnResult = airplane.turnOnAirplane();
		}
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..
	
		return turnOnResult;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	@Override
	public boolean increaseSpeedOnLand() {
		
		if(turnOnResult) { // 비행기 시동 켠 결과가 정상이면 
			increaseSpeedResult = airplane.increaseSpeedOnLand();
		}
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..
	
		return increaseSpeedResult;
	}
	
	// 이륙을 합니다. 
	@Override
	public String takeOff() {
		String status = "";
		
		if(increaseSpeedResult) {
			status = airplane.takeOff();
		}
		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..
	
		return status;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	@Override
	public String wheelIntoBody() {
		String status = "";

		// 오버라이드 해서 해당 파일럿 나머지 상세 기능 구현..

		return status;
	}
}
