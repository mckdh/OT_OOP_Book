package mckdh.decorator.test;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.BomberAirplane;
import mckdh.decorator.airplane.airplanedecorator.DecoratorAirplaneMainWeaponBomb;
import mckdh.decorator.airplane.airplanedecorator.DecoratorAirplaneMilitaryfeatureAirforce;
import mckdh.decorator.airplane.airplanedecorator.DecoratorAirplanePaintingAnimal;
import mckdh.decorator.airplane.airplanedecorator.DecoratorAirplanePersonCockipitTwo;
import mckdh.decorator.airplane.airplanedecorator.DecoratorAirplaneWingTuningFold;
import mckdh.decorator.airplane.cockpit.PowerArmorOnDefaultCockpit;

public class LauncherWW2 {

	public static void main(String[] args) {
		
		//비행기 초기 셋팅 
		Airplane airplane = new BomberAirplane();
		airplane.cockpitSet(new PowerArmorOnDefaultCockpit());
		
		//비행기 장비/환경 셋팅
		// 1. 순정
		System.out.println("비행기 순정 확인");
		System.out.println("비행기 인승 확인 : ["+airplane.cockpitPerson()+"]");
		System.out.println("비행기 무기 확인 : ["+airplane.mainWeapon()+"]");
		System.out.println("비행기 날개 확인 : ["+airplane.wingTuning()+"]");
		System.out.println("비행기 소속 확인 : ["+airplane.militaryFeature()+"]");
		System.out.println("비행기 도장 확인 : ["+airplane.painting()+"]");
		
		System.out.println("");
		
		//추가 장비/환경 셋팅
		Airplane airplaneExtending = new DecoratorAirplaneMainWeaponBomb(
									new DecoratorAirplaneMilitaryfeatureAirforce(
									new DecoratorAirplanePaintingAnimal(
									new DecoratorAirplanePersonCockipitTwo(
									new DecoratorAirplaneWingTuningFold(new BomberAirplane())
									))));
		airplaneExtending.cockpitSet(new PowerArmorOnDefaultCockpit());
		
		// 2.확장 
		System.out.println("비행기 확장 확인");
		System.out.println("비행기 인승 확인 : ["+airplaneExtending.cockpitPerson()+"]");
		System.out.println("비행기 무기 확인 : ["+airplaneExtending.mainWeapon()+"]");
		System.out.println("비행기 날개 확인 : ["+airplaneExtending.wingTuning()+"]");
		System.out.println("비행기 소기속 확인 : ["+airplaneExtending.militaryFeature()+"]");
		System.out.println("비행기 도장 확인 : ["+airplaneExtending.painting()+"]");
				
	}

}
