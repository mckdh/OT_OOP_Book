package mckdh.decorator.airplane.airplanedecorator;

import mckdh.decorator.airplane.Airplane;
import mckdh.decorator.airplane.DecoratorAirplane;

public class DecoratorAirplanePaintingCartoon extends DecoratorAirplanePainting {

	public DecoratorAirplanePaintingCartoon(Airplane airplane) {
		super(airplane);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String painting() {
		return airplane.painting()+", 페인팅을 동물 캐릭터로";
	}
}
