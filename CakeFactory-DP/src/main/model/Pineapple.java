package main.model;

public class Pineapple extends Cake {
	public Pineapple(){
		this.name="Pineapple";
		this.type="Ctype";
		this.price=225;
	}
	
	@Override
	public void recipe() {
		System.out.println("Recipe of Pineapple");
		
	}

	@Override
	public void myFans() {
		System.out.println("Fans of Pineapple");
		
	}

	@Override
	public void aboutCake() {
		System.out.println("About Pineapple");
		
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
