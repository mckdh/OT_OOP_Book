package mckdh.templatemethod.pilot;

import mckdh.templatemethod.airplane.Airplane;
import mckdh.templatemethod.airplane.airplanestate.AirplaneState;

public abstract class Pilot {
	Airplane airplane = null;
	AirplaneState airplaneState = null;
	
	// 생성자, 파일럿을 생성할때 파일럿이 탈 비행기도 정한다. 
	public Pilot(Airplane airplane) {
		this.airplane = airplane;
	}
	
	// 파일럿의 이륙 표준 프로세스
	public boolean takeOffProcess() {
		boolean result = false;
		
		//조종석에 올라탄다. 현재 비행기 상태를 리턴한다. 
		this.airplaneState = intoCockpit();
		
		// 비행기 시동을 켠다. 
		boolean turnOnResult = turnOnAirplane();
		
		boolean isGoodAirplane = false;
		if(turnOnResult) { // 비행기 시동이 잘 켜졌으면   
			isGoodAirplane = checkAirplane(); // 비행기 이상 유무를 체크 한다. 
		} else {
			System.out.println("비행기 구동 중에 문제가 발생 했습니다.");	
		}
		
		boolean increaseSpeedResult = false;
		if(isGoodAirplane) {  // 비행기 체크가 정상이면 
			increaseSpeedResult = increaseSpeedOnLand();
		} else {			
			System.out.println("비행기 체크중에 문제가 발생 했습니다.");	
		}
		
		boolean isProperAltitude = false;
		if(increaseSpeedResult) { // 비행기 속도가 적절하게 증가 했는가.
			isProperAltitude = takeOff(); // 이륙을 한다. (비행기를 들어올린다.)
		} else {
			System.out.println("이륙에 필요한 적절한 속도를 얻는데 문제가 발생 했습니다.");				
		}
		
		if(isProperAltitude) { // 적절한 고도를 얻었는가. 
			airplaneState = wheelIntoBody(); // 바퀴를 닫고 순항 상태로 전환한다. 
		} else {			
			System.out.println("아직 적절한 고도에 오르지 못했습니다.");				
		}
		
		return result;
	}
	
	// 파일럿이 비행기(조종석)에 올라탄다.
	public abstract AirplaneState intoCockpit();
	
	// 비행기 시동을 켭니다.
	public abstract boolean turnOnAirplane();

	// 파일럿이 비행기를 체크 합니다.
	public abstract boolean checkAirplane();
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	public abstract boolean increaseSpeedOnLand();
	
	// 이륙을 합니다. 
	public abstract boolean takeOff();

	// 바퀴를 안으로 집어 넣는다.
	public abstract AirplaneState wheelIntoBody();
}
