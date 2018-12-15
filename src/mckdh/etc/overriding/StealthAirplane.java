package mckdh.etc.overriding;

public class StealthAirplane extends JetAirplane {
	@Override
	public void airplaneFeature() {
		System.out.println("이 비행기는 스텔스 기반");
	}
}
