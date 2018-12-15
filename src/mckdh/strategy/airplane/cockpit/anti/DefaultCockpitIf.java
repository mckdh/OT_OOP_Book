package mckdh.strategy.airplane.cockpit.anti;

public class DefaultCockpitIf {
	int armorPower = 50; // 조종석의 방어력
	int chairFunction = 50; // 의자 기능성 수치 
	int panelFunciton = 50; // 계기판 기능성 수치 
	int comfortableFunction = 50; // 조종석의 편의성 수치
	int escapeFunction = 50; // 탈출 장비 기능성 수치 
	
	String kindCockpit = ""; // 조종석의 종류'
	
	// 생성자에 조종석의 종류 값을 셋팅한다.
	public DefaultCockpitIf(String kindCockpit) {
		this.kindCockpit = kindCockpit;
	}
	
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		if(kindCockpit.equals("기본 조종석")) {
			armorPower = 50;
		} else if(kindCockpit.equals("초 강력 장갑 조종석")) {
			armorPower = 300;			
		} else if(kindCockpit.equals("최첨단 조종석")) {
			armorPower = 100;						
		} else if(kindCockpit.equals("생존 극대화 조종석")) {
			armorPower = 200;									
		} else if(kindCockpit.equals("무적 조종석")) {
			armorPower = 300;									
		}
		
		return armorPower;
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨 
	public int chairFeature() {
		if(kindCockpit.equals("기본 조종석")) {
			chairFunction = 50;
		} else if(kindCockpit.equals("초 강력 장갑 조종석")) {
			chairFunction = 100;			
		} else if(kindCockpit.equals("최첨단 조종석")) {
			chairFunction = 100;						
		} else if(kindCockpit.equals("생존 극대화 조종석")) {
			chairFunction = 200;									
		} else if(kindCockpit.equals("무적 조종석")) {
			chairFunction = 300;									
		}
		
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
