package mckdh.chapter3.polymorphism;

public class Pilot {
	DefaultAirplane defaultAirplane1;
	
	// 파일럿 생성자에서 비행기 객체를 받아 저장한다.
	public Pilot(DefaultAirplane defaultAirplaneReceived) {
		defaultAirplane1 = defaultAirplaneReceived;
	}
	
	// 메소드에서도 비행기 객체를 교체할수 있게 만들었다.
	public void setAirplane(DefaultAirplane defaultAirplaneReceived) {
		defaultAirplane1 = defaultAirplaneReceived;
	}
	
	// 비행기 타기
	public void intoAirplane() {
		defaultAirplane1.airplaneFeature();
	}
}	
