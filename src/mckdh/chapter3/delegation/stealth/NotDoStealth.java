package mckdh.chapter3.delegation.stealth;

public class NotDoStealth implements StealthInterface {

	@Override
	// 스텔스 기능 실행 
	public void doingStealthFunction() {
		System.out.println("스텔스 기능을 쓰지 않습니다.");
	}

}
