package mckdh.state.test;

import mckdh.state.airplane.AirplaneAntiStateFirst;
import mckdh.state.airplane.AirplaneGoodState;
import mckdh.state.airplane.airplanestate.CombatAirplaneState;
import mckdh.state.airplane.airplanestate.CruiseAirplaneState;
import mckdh.state.airplane.airplanestate.DestroyAirplaneState;
import mckdh.state.airplane.airplanestate.LandingAirplaneState;
import mckdh.state.airplane.airplanestate.PatrolAirplaneState;
import mckdh.state.airplane.airplanestate.StandbyAirplaneState;
import mckdh.state.airplane.airplanestate.TakeoffAirplaneState;
import mckdh.state.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class LauncherWW2 {

	public static void main(String[] args) {
		// 안티 패턴 1
		AirplaneAntiStateFirst airplaneAnti = new AirplaneAntiStateFirst(new PowerArmorOnDefaultCockpit());
		airplaneAnti.wheelStatusChange("대기");
		airplaneAnti.engineStatusChange("대기");
		airplaneAnti.electronicStatusChange("대기");
		airplaneAnti.wingStatusChange("대기");
		
		// 좋은 패턴 
		AirplaneGoodState airplane = new AirplaneGoodState(new PowerArmorOnDefaultCockpit());
		airplane.setAirplaneState(new StandbyAirplaneState()); // 대기 상태 전환 
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();
		
		airplane.setAirplaneState(new TakeoffAirplaneState()); // 이륙 상태 전환 
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();	
		
		airplane.setAirplaneState(new CruiseAirplaneState()); // 순항 상태 전환  
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();	
		
		airplane.setAirplaneState(new PatrolAirplaneState()); // 정찰 상태 전환  
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();		
		
		airplane.setAirplaneState(new CombatAirplaneState()); // 전투 상태 전환  
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();
	
		airplane.setAirplaneState(new DestroyAirplaneState()); // 파괴 상태 전환  
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();		
		
		airplane.setAirplaneState(new LandingAirplaneState()); // 착륙 상태 전환  
		airplane.currentStatusExplanation();
		airplane.checkWheelStatus();
		airplane.checkEngineStatus();
		airplane.checkElectronicStatus();
		airplane.checkMachinegunStatus();	
	}

}
