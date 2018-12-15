package mckdh.templatemethod.pilot.anti;

import mckdh.chapter3.delegation.stealth.StealthInterface;

public class Airplane {
	
	protected int airplaneSpeed = 0; // 속도
	protected boolean airplaneSuitableLift = false; // 적당한 양력을 얻었는가.
	protected String airplaneState = ""; // 상태
	protected String wheelState = ""; // 상태
	protected int airplaneAltitude = 0; // 고도
	
	// ********************** 메소드 설명 관련 메소드 *******************//
	StealthInterface stealth = null;

	public Airplane() {
		
	}
	
	public Airplane(StealthInterface stealth) {
		this.stealth = stealth;
	}
	
	public void setStealthInterface(StealthInterface stealth) {
		this.stealth = stealth;
	}
	
	public void doingStealthFunction() {
		stealth.doingStealthFunction();
	}
	
	private int carSpeed = 0; // 전역 변수로 carSpeed가 있다. private로 선언했다는 것은 다른 객체에서 직접 이 속성을 접근하지 못한다는 것이다.

	private void accelerator(boolean isIncrease) { // 속도를 증가하는지 감소하는지를 불린값으로 받음.
		if (isIncrease) { // 속도를 증가하면
			carSpeed++;
		} else { // 속도를 감소하면
			carSpeed--;
		}
	}

	// 비행기의 속도 증가
	private int increasingAccelerator(int beforeSpeed) { // 이름을 이렇게 정의
		// 메소드 내부에서 로직을 아래와 같이 구현.
		int speed = beforeSpeed + 1;
		return speed;
	}
	
	public int durablility = 60; // 내구성 
	private boolean isHighArmor = true; // 초강력 장갑 탑재 유무 
	
	public int getDurability() { // 내구성 속성 get 접근 메소드 
		if(isHighArmor) { // 초강력 장갑 탑재 기능이 맞으면 
			return durablility + 40; // 내구성에다가 40을 더해서 리턴한다. 
		}
		return durablility;
	}

	// ********************** 이륙 관련 메소드 *******************//
	// 비행기 점검을 합니다.
	public boolean checkAirplane() {
		boolean result = false;
		System.out.println("비행기 점검을 합니다. 아직은 점검 했다고 가정하고..");
		result = true;
		System.out.println(result + " 정상입니다.");
		return true;
	}

	// 비행기 시동을 켭니다.
	public boolean turnOnAirplane() {
		boolean result = false;
		System.out.println("비행기 시동을 켭니다. 아직은 시동 켰다고 가정하고..");
		result = true;
		System.out.println(result + " 정상입니다.");
		return result;
	}

	// 땅 위에서 비행기 속도를 증가 합니다.
	public boolean increaseSpeedOnLand() {
		airplaneSpeed = 296;
		System.out.println("비행기 속도가 " + airplaneSpeed + " 입니다. 비행기가 적당한 양력을 얻었다고 가정하고..");
		airplaneSuitableLift = true;
		System.out.println("양력이 " + airplaneSuitableLift + "입니다.");
		return airplaneSuitableLift;
	}

	// 이륙을 합니다.
	public String takeOff() {
		System.out.println("이륙 시도..");
		airplaneState = "비행";
		System.out.println("비행기 상태가 [" + airplaneState + "] 입니다.");
		airplaneAltitude = 1000;
		System.out.println("비행기 고도는 [" + airplaneAltitude + "] 입니다.");
		return airplaneState;
	}

	// 바퀴를 안으로 집어 넣는다.
	public String wheelIntoBody() {
		wheelState = "바퀴숨김";
		System.out.println("비행기 바퀴는 [" + wheelState + "] 상태 입니다.");
		return wheelState;
	}

}
