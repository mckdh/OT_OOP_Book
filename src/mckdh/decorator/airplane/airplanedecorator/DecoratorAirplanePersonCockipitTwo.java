package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplanePersonCockipitTwo extends DecoratorAirplanePersonCockipit {

	public DecoratorAirplanePersonCockipitTwo(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cockpitPerson() {
		return airplane.cockpitPerson()+", 2인승 조종석으로 셋팅함";
	}
}
