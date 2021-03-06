package car.honda;

import car.abstractModel.AbstractCarFactory;
import car.abstractModel.MUVCar;
import car.abstractModel.Sedan;
import car.abstractModel.SmallCar;

public class HondaCarFactory extends AbstractCarFactory {

	@Override
	public SmallCar getSmallCar() {
		return new Brio();
	}

	@Override
	public Sedan getSedan() {
		return new City();
	}

	@Override
	public MUVCar getMUV(){
		return new Mobilio();
	}

}
