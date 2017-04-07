package car.honda;

import car.abstractModel.Sedan;

public class City extends Sedan{
	
	public City(){
		this.modelName = "City-Basic";
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
