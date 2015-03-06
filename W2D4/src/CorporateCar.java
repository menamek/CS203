
public class CorporateCar extends Vehicle implements Asset {
	public int purchasePrice;
	public int currentValue;
	private int yearPurchased;
	private String employee;
	
	
	public CorporateCar(int x, int y, int direction, int price, int value,
			int year, String employee) {
		super(x, y, direction);
		System.out.println("CorporareCar2(7 params) called");
		this.purchasePrice = price;
		this.currentValue = value;
		this.yearPurchased = year;
		this.employee = employee;
	}
	public CorporateCar(int price, int value, int year, String employee){
		this(0, 0, 0, price,value, year, employee);
		System.out.println("CorporareCar2(4 params) called");
	}
	public CorporateCar(int price, int value){
		this(price,value, 2015, null);
		System.out.println("CorporareCar2(2 params) called");
	}
	
	public void accelerate(){
		if(speed <= 60)
			this.speed += 5;		
	}
	public void brake(){
		if(speed >= 5)
			this.speed -= 5;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	@Override
	public int amoritize(int years) {
		
		int yearsSincePurchased = 2015 - yearPurchased;
		
		int amountRemaning = purchasePrice - (purchasePrice / years) * yearsSincePurchased;
		
		if(currentValue >= amountRemaning)
			
			return purchasePrice/years;
		else
			return (purchasePrice/years) + (amountRemaning - currentValue);
			
			
		
	}
	public String toString(){
		return "my fancy car: " + super.toString();
	}
}