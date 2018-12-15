package mckdh.chapter3.delegation.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import mckdh.chapter3.delegation.airplane.Airplane;
import mckdh.chapter3.delegation.pilot.Pilot;

public class PilotTest {
	Pilot pilot = null;
	
	@Before
	public void setUp() throws Exception {
		pilot = new Pilot();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntoCockpit() {
		Airplane airplane = pilot.intoCockpit();
		
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
