package mckdh.strategy.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mckdh.strategy.airplane.AirplaneGoodStrategy;
import mckdh.strategy.airplane.cockpit.PowerArmorOnDefaultCockpit;
import mckdh.strategy.pilot.Pilot;

public class PilotTest {
	Pilot pilot = null;
	
	@Before
	public void setUp() throws Exception {
		AirplaneGoodStrategy airplane = new AirplaneGoodStrategy(new PowerArmorOnDefaultCockpit());
		pilot = new Pilot(airplane);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntoCockpit() {
		AirplaneGoodStrategy airplane = pilot.intoCockpit();
		
		assertNotNull(airplane);
	}

	@Test
	public void checkAirplane() {
		//선행 작업 
		pilot.intoCockpit();
		
		//메인 작업 
		boolean result = pilot.checkAirplane();
		assertTrue(result);
	}
	
	@Test
	public void turnOnAirplane() {
		//선행 작업 
		pilot.intoCockpit();
		pilot.checkAirplane();

		//메인 작업 
		boolean result = pilot.turnOnAirplane();
		assertTrue(result);
	}
	
	@Test
	public void increaseSpeedOnLand() {
		//선행 작업 
		pilot.intoCockpit();
		pilot.checkAirplane();
       	pilot.turnOnAirplane();
       	
		//메인 작업 
		boolean result = pilot.increaseSpeedOnLand();		
		assertTrue(result);
	}
	
	@Test
	public void takeOff() {
		//선행 작업 
		pilot.intoCockpit();
		pilot.checkAirplane();
       	pilot.turnOnAirplane();
        pilot.increaseSpeedOnLand();

		//메인 작업 
		String result = pilot.takeOff();
		assertEquals("비행", result);
	}
	
	@Test
	public void wheelIntoBody() {
		//선행 작업 
		pilot.intoCockpit();
		pilot.checkAirplane();
       	pilot.turnOnAirplane();
        pilot.increaseSpeedOnLand();
        pilot.takeOff();

		//메인 작업 
		String result = pilot.wheelIntoBody();
		assertEquals("바퀴숨김", result);
	}
}
