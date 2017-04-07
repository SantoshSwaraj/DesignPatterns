package main.model;

public class BlueBerry extends Cake {
	public BlueBerry(){
		this.name="BlueBerry";
		this.type="Ctype";
		this.price=200;
	}
	@Override
	public void recipe() {
		System.out.println("Recipe of BlueBerry ");
		
	}

	@Override
	public void myFans() {
		System.out.println("Fans of BlueBerry");
		
	}

	@Override
	public void aboutCake() {
		System.out.println("About BlueBerry");
		
	}

	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getType() {
		return this.type;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
