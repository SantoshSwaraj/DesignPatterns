package main.factory;

import main.model.Cake;

public interface Factory {
	public Cake createCake(String cakeName);
}
