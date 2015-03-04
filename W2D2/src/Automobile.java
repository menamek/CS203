
public class Automobile {
	private String make;
	private String model;
	private int year;
	private String color;
	private int speed;
	
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make=make;
	}
	
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	
	public void Accelerate(){
		this.speed=speed + 10;
	}
	
	public void Brake(){
		if(speed>=10){
			this.speed=speed - 10;
		}
	}
	public void move(){
		System.out.println(" xxxx");
	}

}
