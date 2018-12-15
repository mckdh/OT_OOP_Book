package mckdh.strategy.airplane;

import mckdh.strategy.airplane.cockpit.ComfortableOnDefaultCockpit;
import mckdh.strategy.airplane.cockpit.DefaultCockpit;
import mckdh.strategy.airplane.cockpit.HightechOnDefaultCockpit;
import mckdh.strategy.airplane.cockpit.PowerArmorOnDefaultCockpit;
import mckdh.strategy.airplane.cockpit.anti.DefaultCockpitIf;

public class AirplaneAntiFirst {

	protected int airplaneSpeed = 0; //속도
	protected boolean airplaneSuitableLift = false; //적당한 양력을 얻었는가.
	protected String airplaneState = ""; //상태
	protected String wheelState = ""; //상태
	protected int airplaneAltitude = 0; //고도
	
	protected int armorPower = 100; // 비행기 기체의 방어력을 100으로 가정 
	protected DefaultCockpitIf cockpitIf; // 조종석 객체를 변수로 가짐 
	
	protected PowerArmorOnDefaultCockpit armorCockpit;
	protected HightechOnDefaultCockpit hightechCockpit;
	protected ComfortableOnDefaultCockpit comfortableCockpit;
	
	String kindCockpit = "";

	//********************** 조종석 관련 *******************//
	public AirplaneAntiFirst() { // 비행기 기체 디폴트 생성자 
		cockpitIf = new DefaultCockpitIf("최첨단 조종석"); // 조종석 객체를 생성해서 조종석 객체의 방어력을 얻는다.
		
		armorPower += cockpitIf.armorFeature();
		System.out.println("이 배행기의 방어력은 ["+armorPower+"] 입니다.");
	}

	//********************** 조종석 관련 연동 메소드 *******************//
	
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		int result = cockpitIf.armorFeature();

		return result;
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨 
	public int chairFeature() {
		int result = cockpitIf.chairFeature();
		// ..위의 armorFeature()와 비슷한 구성..
		return result;
	}
	
	// 계기판 기능 구현, 실제로는 계기판 관련 각종 로직이 구현됨 
	public int panelFeature() {
		int result = cockpitIf.panelFeature();
		// ..위의 armorFeature()와 비슷한 구성..
		return result;
	}
	
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨 
	public int comfortableFeature() {
		int result = cockpitIf.comfortableFeature();
		// ..위의 armorFeature()와 비슷한 구성..
		return result;
	}
	
	// 탈출 장비 기능 구현, 실제로는 탈출 장비 관련 각종 로직이 구현됨 
	public int escapeFeature() {
		int result = cockpitIf.escapeFeature();
		// ..위의 armorFeature()와 비슷한 구성..
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
