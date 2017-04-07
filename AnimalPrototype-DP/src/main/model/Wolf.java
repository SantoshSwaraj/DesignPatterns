package main.model;

public class Wolf implements Animal {
	private String name="Default";

	public Wolf() {
		/*try{
			Thread.sleep(1*1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}*/
	}

	@Override
	public Animal createClone() {
		Wolf wolf = null;
		try{
			wolf = (Wolf)super.clone();
			//You can write your own specific clone code.
			name = "Default"+System.nanoTime();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return wolf;
	}

	@Override
	public String getName() {
		return name;
	}
}
