package mckdh.templatemethod.airplane;

import mckdh.templatemethod.airplane.airplanestate.AirplaneState;
import mckdh.templatemethod.airplane.airplanestate.CruiseAirplaneState;
import mckdh.templatemethod.airplane.airplanestate.StandbyAirplaneState;
import mckdh.templatemethod.airplane.airplanestate.TakeoffAirplaneState;
import mckdh.templatemethod.airplane.cockpit.ComfortableOnDefaultCockpit;
import mckdh.templatemethod.airplane.cockpit.DefaultCockpit;
import mckdh.templatemethod.airplane.cockpit.HightechOnDefaultCockpit;
import mckdh.templatemethod.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class Airplane {

	int armorPower = 100; // 비행기 기체의 방어력을 100으로 가정 
	int airplaneSpeed = 0; //속도
	int airplaneAltitude = 0; //고도
	boolean airplaneSuitableLift = false; //적당한 양력을 얻었는가.
	boolean airplaneSuitableAltitude = false; //적당한 고도를 얻었는가.
	
	//Strategy pattern 관련 
	DefaultCockpit cockpit; // 조종석 객체를 변수로 가짐
	PowerArmorOnDefaultCockpit armorCockpit;
	HightechOnDefaultCockpit hightechCockpit;
	ComfortableOnDefaultCockpit comfortableCockpit;

	//State pattern 관련 
	AirplaneState airplaneState;
	
	//********************** 조종석 관련 *******************//

	// 조종석 부모 클래스를 인자로 받는 생성자.
	public Airplane(DefaultCockpit cockpit) {
		this.cockpit = cockpit;
		armorPower += cockpit.armorFeature();  
		System.out.println("이 배행기의 방어력은 ["+armorPower+"] 입니다.");
		
		// 현재 상태는 대기 상태
		airplaneState = new StandbyAirplaneState();
	}
	
	//********************** 조종석 관련 연동 메소드(Strategy pattern) *******************//

	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		return cockpit.armorFeature();
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨 
	public int chairFeature() {
		return cockpit.chairFeature();
	}
	
	// 계기판 기능 구현, 실제로는 계기판 관련 각종 로직이 구현됨 
	public int panelFeature() {
		return cockpit.panelFeature();
	}
	
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨 
	public int comfortableFeature() {
		return cockpit.comfortableFeature();
	}
	
	// 탈출 장비 기능 구현, 실제로는 탈출 장비 관련 각종 로직이 구현됨 
	public int escapeFeature() {
		return cockpit.escapeFeature();
	}
	
	//********************** 비행기 상태 관련 메소드(State pattern) *******************//
	// 비행 상태 객체 리턴 
	public AirplaneState getAirplaneState() {
		return airplaneState;
	}

	// 비행 상태 객체 셋팅 
	public void setAirplaneState(AirplaneState airplaneState) {
		this.airplaneState = airplaneState;
		currentStatusExplanation();
	}
	
	// 바퀴 관련 상태 변경 
	public String checkWheelStatus() {
		String result = airplaneState.checkWheelStatus();
		System.out.println("result ["+result+"]");
		return result;
	}

	// 엔진 관련 상태 변경 
	public String checkEngineStatus() {
		String result = airplaneState.checkEngineStatus();
		System.out.println("result ["+result+"]");
		return result;
	}

	// 통신 장비 관련 상태 변경 
	public String checkElectronicStatus() {
		String result = airplaneState.checkElectronicStatus();
		System.out.println("result ["+result+"]");
		return result;	
	}

	// 날개 관련 상태 변경
	public String checkWingStatus() {
		String result = airplaneState.checkWingStatus();
		System.out.println("result ["+result+"]");
		return result;
	}

	// 머신건 관련 상태 변경
	public String checkMachinegunStatus() {
		String result = airplaneState.checkMachinegunStatus();
		System.out.println("result ["+result+"]");
		return result;
	}
 
	// 현재 상태 확인 
	public String currentStatusExplanation() {
		String result = airplaneState.currentStatusExplanation();
		System.out.println("result ["+result+"]");
		return result;
	}
	
	//********************** 이륙 관련 메소드 *******************//
	// 비행기 점검을 합니다.
	public boolean checkAirplane() {
		boolean result = false;
		System.out.println("비행기 점검을 합니다. 아직은 점검 했다고 가정하고..");
		result = true;
		System.out.println(result+" 정상입니다.");
		return true;
	}
	
	// 비행기 시동을 켭니다.
	public boolean turnOnAirplane() {
		airplaneState = new TakeoffAirplaneState(); // 이륙 상태로 스스로 전환

		boolean result = false;
		System.out.println("비행기 시동을 켭니다. 아직은 시동 켰다고 가정하고..");
		result = true;
		System.out.println(result+" 정상입니다.");
		return result;
	}
	
	// 땅 위에서 비행기 속도를 증가 합니다.
	public boolean increaseSpeedOnLand() {
		
		airplaneSpeed = 296;
		System.out.println("비행기 속도가 "+airplaneSpeed+" 입니다. 비행기가 적당한 양력을 얻었다고 가정하고..");
		airplaneSuitableLift = true;
		System.out.println("양력이 "+airplaneSuitableLift+"입니다.");
		return airplaneSuitableLift;
	}
	
	// 이륙을 합니다. 
	public boolean takeOff() {
		System.out.println("이륙 시도..");
		airplaneAltitude = 1000;				
		System.out.println("비행기 고도는 ["+airplaneAltitude+"] 입니다.");
		airplaneSuitableAltitude = true;
		
		return airplaneSuitableAltitude;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	public AirplaneState wheelIntoBody() {
		airplaneState = new CruiseAirplaneState(); // 순항 상태로 스스로 전환

		return airplaneState;
	}
}
