package car.abstractModel;

public abstract class Sedan implements Car {
	protected String modelName;
	
	public abstract void setModelName(String modelName);
	public abstract String getModelName();
	
}
