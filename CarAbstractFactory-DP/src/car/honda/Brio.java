package car.honda;

import car.abstractModel.SmallCar;

public class Brio extends SmallCar {
	public Brio(){
		this.modelName = "Brio-Basic";
	}

	@Override
	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}

	@Override
	public String getModelName(){
		return this.modelName;
	}

}
