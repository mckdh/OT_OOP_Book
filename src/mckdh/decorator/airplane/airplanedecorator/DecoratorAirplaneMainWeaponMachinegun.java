package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneMainWeaponMachinegun extends DecoratorAirplaneMainWeapon {

	public DecoratorAirplaneMainWeaponMachinegun(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mainWeapon() {
		return airplane.mainWeapon()+", 보조 기관총 강화";
	}
}
