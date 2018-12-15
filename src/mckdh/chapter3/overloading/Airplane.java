package mckdh.chapter3.overloading;

public class Airplane {
	public Airplane() {
		System.out.println("무기가 없어요");
	}

	public Airplane(String weapon) {
		System.out.println(weapon+" 탑재, 그런데 탄약이 없어요.");
	}

	public Airplane(String weapon, String ammo) {
		System.out.println(weapon+" 탑재 "+ammo+"도 받았다.");
	}

	public String getWeaponStatus() {
		String status = "무기가 없어요.";
		return status;
	}

	public String getWeaponStatus(String weapon) {
		String status = weapon+" 탑재, 그런데 탄약이 없어요.";
		return status;
	}

	public String getWeaponStatus(String weapon, String ammo) {
		String status = weapon+" 탑재 "+ammo+"도 받았다.";
		return status;
	}

}
