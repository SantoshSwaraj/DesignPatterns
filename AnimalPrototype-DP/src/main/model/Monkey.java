package main.model;

public class Monkey implements Animal{
	private String name="Default";

	public Monkey() {
		try{
			Thread.sleep(1*1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	@Override
	public Animal createClone() {
		Monkey Monkey = null;
		try{
			Monkey = (Monkey)super.clone();
			//You can write your own specific clone code.
			name = "Default"+System.nanoTime();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return Monkey;
	}

	@Override
	public String getName() {
		return name;
	}

}
