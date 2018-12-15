package mckdh.templatemethod.airplane.cockpit;

public class PowerArmorOnDefaultCockpit extends DefaultCockpit {
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨  
	public int armorFeature() {
		armorPower = 300;
		return armorPower;
	}
}
