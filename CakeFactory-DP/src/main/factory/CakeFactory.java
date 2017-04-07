package main.factory;

import main.model.BlackForest;
import main.model.BlueBerry;
import main.model.Cake;
import main.model.LitchiGateaux;
import main.model.Pineapple;

public class CakeFactory implements Factory{
	public Cake createCake(String cakeName){
		Cake cake = null;
		if(cakeName.equals("BlackForest")){
			cake =  new BlackForest();
		}
		else if(cakeName.equals("LitchiGateaux")){
			cake = new LitchiGateaux();
		}
		else if(cakeName.equals("BlueBerry")){
			cake = new BlueBerry();
		}
		else if(cakeName.equals("Pineapple")){
			cake = new Pineapple();
		}
		return cake;
	}
}
