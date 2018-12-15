package mckdh.chapter3.delegation.stealth;

public class NormalStealth implements StealthInterface {

	@Override
	// 스텔스 기능 실행 
	public void doingStealthFunction() {
		System.out.println("일반적인 스텔스 입니다.");
	}

}
