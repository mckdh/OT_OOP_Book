package mckdh.decorator.airplane.cockpit;

public class ComfortableOnDefaultCockpit extends DefaultCockpit {
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨 
	public int comfortableFeature() {
		comfortableFunction = 300;
		return comfortableFunction;
	}
	
}
