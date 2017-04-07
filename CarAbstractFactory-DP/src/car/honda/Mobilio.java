package car.honda;

import car.abstractModel.MUVCar;

public class Mobilio extends MUVCar {
	public Mobilio(){
		this.modelName = "Mobilio-Basic";
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
