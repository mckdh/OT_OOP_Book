package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneMainWeaponBomb extends DecoratorAirplaneMainWeapon {

	public DecoratorAirplaneMainWeaponBomb(Airplane airplane) {
		super(airplane);
	}

	@Override
	public String mainWeapon() {
		return airplane.mainWeapon()+", 폭탄 장착";
	}
}
