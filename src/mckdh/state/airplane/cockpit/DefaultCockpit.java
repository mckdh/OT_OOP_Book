package mckdh.state.airplane.cockpit;

public class DefaultCockpit {
	int armorPower = 50; // 조종석의 방어력
	int chairFunction = 50; // 의자 기능성 수치 
	int panelFunciton = 50; // 계기판 기능성 수치 
	int comfortableFunction = 50; // 조종석의 편의성 수치
	int escapeFunction = 50; // 탈출 장비 기능성 수치 
	
	String kindCockpit = ""; // 상태값 
	
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		return armorPower;
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨 
	public int chairFeature() {
		return chairFunction;
	}
	
	// 계기판 기능 구현, 실제로는 계기판 관련 각종 로직이 구현됨 
	public int panelFeature() {
		return panelFunciton;
	}
	
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨 
	public int comfortableFeature() {
		return comfortableFunction;
	}
	
	// 탈출 장비 기능 구현, 실제로는 탈출 장비 관련 각종 로직이 구현됨 
	public int escapeFeature() {
		return escapeFunction;
	}
}
