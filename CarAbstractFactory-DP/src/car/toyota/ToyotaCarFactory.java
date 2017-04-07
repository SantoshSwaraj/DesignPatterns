package car.toyota;

import car.abstractModel.AbstractCarFactory;
import car.abstractModel.MUVCar;
import car.abstractModel.Sedan;
import car.abstractModel.SmallCar;

public class ToyotaCarFactory extends AbstractCarFactory {

	@Override
	public SmallCar getSmallCar() {
		return new Liva();
	}

	@Override
	public Sedan getSedan() {
		return new Altis();
	}

	@Override
	public MUVCar getMUV() {
		return new Innova();
	}

}
