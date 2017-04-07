package main.test;

import java.util.Scanner;

import main.factory.CakeFactory;
import main.factory.Factory;
import main.model.Cake;

public class TestClass {
	public static void main(String args[]){
		Cake cake = null;
		System.out.println("Enter your cake choice : ");
		Scanner console = new Scanner(System.in);
		String choice = console.next();
		console.close();
		Factory factory = new CakeFactory();
		cake = factory.createCake(choice);
		System.out.println("Cake Price : "+cake.getPrice());
	}
}
