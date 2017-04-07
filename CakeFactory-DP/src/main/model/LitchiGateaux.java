package main.model;

public class LitchiGateaux extends Cake{
	public LitchiGateaux(){
		this.name="LitchiGateaux";
		this.type="Btype";
		this.price=175;
	}
	
	@Override
	public void recipe() {
		System.out.println("Recipe of LitchiGateaux ");
		
	}

	@Override
	public void myFans() {
		System.out.println("Fans of LitchiGateaux");
		
	}

	@Override
	public void aboutCake() {
		System.out.println("About LitchiGateaux");
		
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
