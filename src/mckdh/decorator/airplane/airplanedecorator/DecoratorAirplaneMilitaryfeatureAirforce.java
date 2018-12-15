package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneMilitaryfeatureAirforce extends DecoratorAirplaneMilitaryfeature {

	public DecoratorAirplaneMilitaryfeatureAirforce(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String militaryFeature() {
		return airplane.militaryFeature()+", 해군 소속 비행기";
	}
}
