package mckdh.chapter3.delegation.stealth;

public class UltraStealth implements StealthInterface {

	@Override
	// 스텔스 기능 실행 
	public void doingStealthFunction() {
		System.out.println("울트라 스텔스 기능 입니다.");
	}

}
