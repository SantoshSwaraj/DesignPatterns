package car.abstractModel;

import car.honda.HondaCarFactory;
import car.toyota.ToyotaCarFactory;

public abstract class AbstractCarFactory {
	public abstract SmallCar getSmallCar();
	public abstract Sedan getSedan();
	public abstract MUVCar getMUV();
	
	public static AbstractCarFactory ofType(String manufacturerName)throws Exception{
		AbstractCarFactory carFactory = null;
		switch(manufacturerName){
			case "Toyota":
				carFactory = new ToyotaCarFactory();
				break;
			case "Honda":
				carFactory = new HondaCarFactory();
				break;
				
			default:
				throw new UnsupportedOperationException("-Unknown Manufacturer");
				
		}
		return carFactory;
	}
}
 