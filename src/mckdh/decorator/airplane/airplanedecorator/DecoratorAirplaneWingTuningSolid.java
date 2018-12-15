package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplaneWingTuningSolid extends DecoratorAirplaneWingTuning {

	public DecoratorAirplaneWingTuningSolid(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String wingTuning() {
		return airplane.wingTuning()+", 비행기 날개 고정";
	}

}
