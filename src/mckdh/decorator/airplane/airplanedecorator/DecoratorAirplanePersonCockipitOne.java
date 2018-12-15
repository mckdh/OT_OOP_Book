package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;

public class DecoratorAirplanePersonCockipitOne extends DecoratorAirplanePersonCockipit {

	public DecoratorAirplanePersonCockipitOne(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cockpitPerson() {
		return airplane.cockpitPerson()+", 2인승 조종석으로 셋팅함";
	}
}
