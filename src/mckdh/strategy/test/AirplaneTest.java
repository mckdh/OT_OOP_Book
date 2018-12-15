package mckdh.strategy.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mckdh.strategy.airplane.AirplaneGoodStrategy;
import mckdh.strategy.airplane.cockpit.DefaultCockpit;
import mckdh.strategy.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class AirplaneTest {
	AirplaneGoodStrategy airplane;
	DefaultCockpit defaultCockpit;

	@Before
	public void setUp() throws Exception {
		airplane = new AirplaneGoodStrategy(new PowerArmorOnDefaultCockpit());
		defaultCockpit = new PowerArmorOnDefaultCockpit();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	//********************** 조종석 관련 연동 메소드(Strategy pattern) *******************//
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
	}
}
