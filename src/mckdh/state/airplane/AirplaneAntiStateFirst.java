package mckdh.state.airplane;

import mckdh.state.airplane.cockpit.ComfortableOnDefaultCockpit;
import mckdh.state.airplane.cockpit.DefaultCockpit;
import mckdh.state.airplane.cockpit.HightechOnDefaultCockpit;
import mckdh.state.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class AirplaneAntiStateFirst {

	protected int airplaneSpeed = 0; //속도
	protected boolean airplaneSuitableLift = false; //적당한 양력을 얻었는가.
	protected String airplaneState = ""; //상태
	protected String wheelState = ""; //상태
	protected int airplaneAltitude = 0; //고도
	
	protected int armorPower = 100; // 비행기 기체의 방어력을 100으로 가정 
	
	//Strategy pattern 관련 
	protected DefaultCockpit cockpit; // 조종석 객체를 변수로 가짐
	protected PowerArmorOnDefaultCockpit armorCockpit;
	protected HightechOnDefaultCockpit hightechCockpit;
	protected ComfortableOnDefaultCockpit comfortableCockpit;

	//State pattern 관련 
	protected String wheelImplement = "";
	protected String engineImplement = "";
	protected String electronicImplement = "";
	protected String wingImplement = "";
	
	//********************** 조종석 관련 *******************//

	// 조종석 부모 클래스를 인자로 받는 생성자.
	public AirplaneAntiStateFirst(DefaultCockpit cockpit) {
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
	// 바퀴 관련 상태 변경 
	public String wheelStatusChange(String statusGubun) {
		if(statusGubun.equals("대기")) {
			wheelImplement = "바퀴 열려 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("이륙")) {
			wheelImplement = "바퀴 열려 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("순항")) {
			wheelImplement = "바퀴 닫혀 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("착륙")) {
			wheelImplement = "바퀴 열려 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		}
		System.out.println("result ["+wheelImplement+"]");
		return wheelImplement;
	}

	// 엔진 관련 상태 변경 
	public String engineStatusChange(String statusGubun) {
		if(statusGubun.equals("대기")) {
			engineImplement = "엔진 꺼져 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("이륙")) {
			engineImplement = "엔진 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("순항")) {
			engineImplement = "엔진 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("착륙")) {
			engineImplement = "엔진 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		}
		System.out.println("result ["+engineImplement+"]");
		return engineImplement;
	}

	// 통신 장비 관련 상태 변경 
	public String electronicStatusChange(String statusGubun) {
		if(statusGubun.equals("대기")) {
			electronicImplement = "통신 장비 꺼져 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("이륙")) {
			electronicImplement = "통신 장비 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("순항")) {
			electronicImplement = "통신 장비 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("착륙")) {
			electronicImplement = "통신 장비 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		}
		System.out.println("result ["+electronicImplement+"]");
		return electronicImplement;
	}

	// 날개 관련 상태 변경
	public String wingStatusChange(String statusGubun) {
		if(statusGubun.equals("대기")) {
			wingImplement = "날개 접혀 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("이륙")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("순항")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("착륙")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("정찰")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("전투")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("피격")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		} else if(statusGubun.equals("파괴")) {
			wingImplement = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		}
		System.out.println("result ["+wingImplement+"]");
		return wingImplement;
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
		airplaneState = "비행";
		System.out.println("비행기 상태가 ["+airplaneState+"] 입니다.");
		airplaneAltitude = 1000;				
		System.out.println("비행기 고도는 ["+airplaneAltitude+"] 입니다.");
		return airplaneState;
	}
	
	// 바퀴를 안으로 집어 넣는다.
	public String wheelIntoBody() {
		wheelState = "바퀴숨김";
		System.out.println("비행기 바퀴는 ["+wheelState+"] 상태 입니다.");
		return wheelState;
	}
}
