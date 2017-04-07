package main.model;

public abstract class Cake {
	protected String name;
	protected String type;
	protected int price;

	public abstract void recipe();
	public abstract void myFans();
	public abstract void aboutCake();
	public abstract String getName();
	public abstract String getType();
	public abstract int getPrice();
	
}
