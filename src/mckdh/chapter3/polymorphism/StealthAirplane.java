package mckdh.chapter3.polymorphism;

public class StealthAirplane extends JetAirplane {
	@Override
	public void airplaneFeature() {
		System.out.println("이 비행기는 스텔스 기반");
	}
	
	public void stealthFucntion() {
		System.out.println("스텔스 기능을 제공합니다.");		
	}
}
