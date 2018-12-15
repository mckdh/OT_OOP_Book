package mckdh.decorator.airplane.airplanestate;

public interface AirplaneState {

	// 바퀴 상태 체크 
	public String checkWheelStatus();
	
	// 엔진 상태 체크 
	public String checkEngineStatus();
	
	// 통신 장비 상태 체크 
	public String checkElectronicStatus();
	
	// 날개 상태 체크 
	public String checkWingStatus();
	
	// 기관총 상태 체크 
	public String checkMachinegunStatus();

	// 현재 상태 클래스 정보 
	public String currentStatusExplanation();
}
