package main.model;

public class BlackForest extends Cake {

	public BlackForest(){
		this.name = "BlackForest";
		this.type = "Atype";
		this.price=150;
	}
	@Override
	public void recipe() {
		System.out.println("Recipe of BlackForest");
		
	}

	@Override
	public void myFans() {
		System.out.println("Fans of BlackForest");
		
	}

	@Override
	public void aboutCake() {
		System.out.println("About BlackForest");
		
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
