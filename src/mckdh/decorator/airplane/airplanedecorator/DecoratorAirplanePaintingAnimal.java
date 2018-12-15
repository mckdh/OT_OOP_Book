package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplanePaintingAnimal extends DecoratorAirplanePainting {

	public DecoratorAirplanePaintingAnimal(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String painting() {
		return airplane.painting()+", 페인팅을 만화 캐릭터로";
	}
}
