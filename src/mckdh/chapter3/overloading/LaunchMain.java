package mckdh.chapter3.overloading;

public class LaunchMain {
	public static void main(String[] args) {
		// 생성자로 실행
		Airplane airplane1 = new Airplane(); // 1
		Airplane airplane2 = new Airplane("기관총"); // 2
		Airplane airplane3 = new Airplane("기관총", "탄약"); // 2

		// 메소드로 실행
		System.out.println(airplane1.getWeaponStatus());
		System.out.println(airplane1.getWeaponStatus("기관총"));
		System.out.println(airplane1.getWeaponStatus("기관총", "탄약"));
	}
}
