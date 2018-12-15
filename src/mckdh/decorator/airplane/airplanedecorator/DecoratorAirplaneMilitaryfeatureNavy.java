package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneMilitaryfeatureNavy extends DecoratorAirplaneMilitaryfeature {

	public DecoratorAirplaneMilitaryfeatureNavy(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String militaryFeature() {
		return airplane.militaryFeature()+", 공군 소속 비행기";
	}
}
