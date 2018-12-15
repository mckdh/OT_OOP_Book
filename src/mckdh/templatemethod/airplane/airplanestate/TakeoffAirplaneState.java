package mckdh.templatemethod.airplane.airplanestate;

public class TakeoffAirplaneState implements AirplaneState {

	public TakeoffAirplaneState() {
		System.out.println(currentStatusExplanation());
	}
	
	@Override
	public String checkWheelStatus() {
		String result = "바퀴 열려 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkEngineStatus() {
		String result = "엔진 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkElectronicStatus() {
		String result = "통신 장비 켜 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkWingStatus() {
		String result = "날개 펴 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkMachinegunStatus() {
		String result = "기관총 OFF 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}
	
	@Override
	public String currentStatusExplanation() {
		return "비행기가 이륙 상태 입니다.";
	}
}
