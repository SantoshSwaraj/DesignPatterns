package car.toyota;

import car.abstractModel.SmallCar;

public class Liva extends SmallCar{

	public Liva(){
		this.modelName="Liva-Basic";
	}
	@Override
	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}

	@Override
	public String getModelName() {
		return this.modelName;
	}

}
