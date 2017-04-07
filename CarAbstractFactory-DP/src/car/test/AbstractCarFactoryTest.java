package car.test;

import org.junit.Before;

import car.abstractModel.AbstractCarFactory;
import car.abstractModel.SmallCar;

public class AbstractCarFactoryTest {
	private AbstractCarFactory carFactory;
	
	@Before
	public void setup(){
		try {
			carFactory = AbstractCarFactory.ofType(/*"Toyota"*//*"Honda"*/"Abc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@org.junit.Test
	public void Test(){
		SmallCar smallcar = carFactory.getSmallCar();
		System.out.println("My Car :"+smallcar.getModelName());
	}
}
