package car.toyota;

import car.abstractModel.Sedan;

public class Altis extends Sedan {
	public Altis(){
		this.modelName="Altis-Basic";
	}

	@Override
	public void setModelName(String modelName) {
		this.modelName=modelName;
		
	}

	@Override
	public String getModelName() {
		return this.modelName;
	}
	
}
