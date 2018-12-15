package mckdh.decorator.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.BomberAirplane;
import mckdh.decorator.airplane.airplanestate.StandbyAirplaneState;
import mckdh.decorator.airplane.cockpit.DefaultCockpit;
import mckdh.decorator.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class AirplaneTest {
	Airplane airplane;
	DefaultCockpit defaultCockpit;

	@Before
	public void setUp() throws Exception { 
		airplane = new BomberAirplane();
		airplane.cockpitSet(new PowerArmorOnDefaultCockpit());
		defaultCockpit = new PowerArmorOnDefaultCockpit();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	//********************** 비행기 상태 관련 메소드(State pattern) *******************//
	
	/*
	// 바퀴 관련 상태 변경, 의도한 결과값이 나오는지 확인 
	@Test
	public void checkWheelStatus() {
		airplane.setAirplaneState(new StandbyAirplaneState()); // 대기 였을때 의도한 값이 나오는지 
		String result = airplane.checkWheelStatus();
		assertEquals(result, "바퀴 열려 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..");
	}

	// 엔진 관련 상태 변경, 의도한 결과값이 나오는지 확인 
	@Test
	public void checkEngineStatus() {
		airplane.setAirplaneState(new StandbyAirplaneState()); // 대기 였을때 의도한 값이 나오는지 
		String result = airplane.checkEngineStatus();
		assertEquals(result, "엔진 꺼져 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..");
	}
 
	// 통신 장비 관련 상태 변경, 의도한 결과값이 나오는지 확인 
	@Test
	public void checkElectronicStatus() {
		airplane.setAirplaneState(new StandbyAirplaneState()); // 대기 였을때 의도한 값이 나오는지 
		String result = airplane.checkElectronicStatus();
		assertEquals(result, "통신 장비 꺼져 있는 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..");
	}

	// 날개 관련 상태 변경, 의도한 결과값이 나오는지 확인 
	@Test
	public void checkMachinegunState() {
		airplane.setAirplaneState(new StandbyAirplaneState()); // 대기 였을때 의도한 값이 나오는지 
		String result = airplane.checkMachinegunStatus();
		assertEquals(result, "기관총 OFF 상태 구현, 실제로는 관련 그래픽/효과 처리 로직이 구현됨..");
	}*/

	//********************** 조종석 관련 연동 메소드(Strategy pattern) *******************//
	/*
	// 방어력 구현, 실제로는 방어력 관련 각종 로직이 구현됨, 여기서는 Strategy pattern 연동 결과에 문제가 없는지(=결과값이 같은지) 확인  
	@Test
	public void testArmorFeature() {
		int airplaneResult = airplane.armorFeature();
		int defaultCockpitResult = defaultCockpit.armorFeature();
		assertEquals(airplaneResult, defaultCockpitResult);
	}
	
	// 의자 기능 구현, 실제로는 의자 관련 각종 로직이 구현됨, 여기서는 Strategy pattern 연동 결과에 문제가 없는지(=결과값이 같은지) 확인 
	@Test
	public void testChairFeature() {
		int airplaneResult = airplane.chairFeature();
		int defaultCockpitResult = defaultCockpit.chairFeature();
		assertEquals(airplaneResult, defaultCockpitResult);
	}
	
	// 계기판 기능 구현, 실제로는 계기판 관련 각종 로직이 구현됨, 여기서는 Strategy pattern 연동 결과에 문제가 없는지(=결과값이 같은지) 확인 
	@Test
	public void testPanelFeature() {
		int airplaneResult = airplane.panelFeature();
		int defaultCockpitResult = defaultCockpit.panelFeature();
		assertEquals(airplaneResult, defaultCockpitResult);
	}
	
	// 편의 장비 기능 구현, 실제로는 편의 장비 관련 각종 로직이 구현됨, 여기서는 Strategy pattern 연동 결과에 문제가 없는지(=결과값이 같은지) 확인 
	@Test
	public void testComfortableFeature() {
		int airplaneResult = airplane.comfortableFeature();
		int defaultCockpitResult = defaultCockpit.comfortableFeature();
		assertEquals(airplaneResult, defaultCockpitResult);
	}
	
	// 탈출 장비 기능 구현, 실제로는 탈출 장비 관련 각종 로직이 구현됨, 여기서는 Strategy pattern 연동 결과에 문제가 없는지(=결과값이 같은지) 확인 
	@Test
	public void testEscapeFeature() {
		int airplaneResult = airplane.escapeFeature();
		int defaultCockpitResult = defaultCockpit.escapeFeature();
		assertEquals(airplaneResult, defaultCockpitResult);
	}*/
}
