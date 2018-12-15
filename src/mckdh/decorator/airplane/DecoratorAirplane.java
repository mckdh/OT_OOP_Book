package mckdh.decorator.airplane;

public class DecoratorAirplane extends Airplane{
	protected Airplane airplane;
	
	public DecoratorAirplane(Airplane airplane) {
		this.airplane = airplane;
	} 
	
	@Override
	public String cockpitPerson() {
		return airplane.cockpitPerson();
	}

	@Override
	public String mainWeapon() {
		return airplane.mainWeapon();
	}

	@Override
	public String wingTuning() {
		return airplane.wingTuning();
	}

	@Override
	public String militaryFeature() {
		return airplane.militaryFeature();
	}

	@Override
	public String painting() {
		return airplane.painting();
	}

}
