package mckdh.decorator.airplane;

public class FighterAirplane extends Airplane {

	public FighterAirplane() {
		System.out.println("전투기 입니다.");
	}
	
	@Override
	//조종석 몇인승 
	public String cockpitPerson() {
		return "전투기의 순정 조종석";
	}

	@Override
	//메인 무기
	public String mainWeapon() {
		return "전투기의 순정 기관총";
	}

	@Override
	//날개 종류 
	public String wingTuning() {
		return "전투기의 순정 날개";
	}

	@Override
	//군대 소속 
	public String militaryFeature() {
		return "전투기의 군종 선택전";
	}

	@Override
	//외부 도장 
	public String painting() {
		return "전투기의 순정 페인팅";
	}
}
