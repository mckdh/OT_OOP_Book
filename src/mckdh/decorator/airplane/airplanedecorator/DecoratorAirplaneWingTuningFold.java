package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneWingTuningFold extends DecoratorAirplaneWingTuning {

	public DecoratorAirplaneWingTuningFold(Airplane airplane) {
		super(airplane);
	}
	
	@Override
	public String wingTuning() {
		return airplane.wingTuning()+", 비행기 날개 접힘";
	}

}
