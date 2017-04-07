package car.toyota;

import car.abstractModel.MUVCar;

public class Innova extends  MUVCar {
	
	public Innova(){
		this.modelName="Innova-Basic";
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
