package mckdh.state.airplane;

import mckdh.state.airplane.airplanestate.AirplaneState;
import mckdh.state.airplane.cockpit.ComfortableOnDefaultCockpit;
import mckdh.state.airplane.cockpit.DefaultCockpit;
import mckdh.state.airplane.cockpit.HightechOnDefaultCockpit;
import mckdh.state.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class AirplaneGoodState {

	protected int airplaneSpeed = 0; //속도
	protected boolean airplaneSuitableLift = false; //적당한 양력을 얻었는가.
	protected String airplaneStateNow = ""; //상태
	protected String wheelState = ""; //상태
	protected int airplaneAltitude = 0; //고도
	
	protected int armorPower = 100; // 비행기 기체의 방어력을 100으로 가정 
	
	//Strategy pattern 관련 
	protected DefaultCockpit cockpit; // 조종석 객체를 변수로 가짐

	//State pattern 관련 
	protected AirplaneState airplaneState;
	
	//********************** 조종석 관련 *******************//

	// 조종석 부모 클래스를 인자로 받는 생성자.
	public AirplaneGoodState(DefaultCockpit cockpit) {
		this.cockpit = cockpit;
		armorPower += cockpit.armorFeature();  
		System.out.println("이 배행기의 방어력은 ["+armorPower+"] 입니다.");
	}
	
	//********************** 조종석 관련 연동 메소드 *******************//

	
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
	
	//********************** 비행기 상태 관련 메소드 *******************//
	// 비행 상태 객체 리턴 
	public AirplaneState getAirplaneState() {
		return airplaneState;
	}

	// 비행 상태 객체 셋팅 
	public void setAirplaneState(AirplaneState airplaneState) {
		this.airplaneState = airplaneState;
		System.out.println(" ");
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
	public String takeOff() {
		System.out.println("이륙 시도..");
		airplaneStateNow = "비행";
		System.out.println("비행기 상태가 ["+airplaneStateNow+"] 입니다.");
		airplaneAltitude = 1000;				
		System.out.println("비행기 고도는 ["+airplaneAltitude+"] 입니다.");
		return airplaneStateNow;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	public String wheelIntoBody() {
		wheelState = "바퀴숨김";
		System.out.println("비행기 바퀴는 ["+wheelState+"] 상태 입니다.");
		return wheelState;
	}
}
