package mckdh.state.airplane.airplanestate;

public class DestroyAirplaneState implements AirplaneState {

	@Override
	public String checkWheelStatus() {
		String result = "바퀴 파괴 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkEngineStatus() {
		String result = "엔진 파괴 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkElectronicStatus() {
		String result = "통신 파괴 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkWingStatus() {
		String result = "날개 파괴 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}

	@Override
	public String checkMachinegunStatus() {
		String result = "기관총 파괴 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..";
		return result;
	}
	
	@Override
	public String currentStatusExplanation() {
		return "비행기가 파괴된 상태 입니다.";
	}
}
