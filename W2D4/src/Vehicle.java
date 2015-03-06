
public abstract class Vehicle {
	private int x;
    private int y;
	protected int speed;
	private int direction;
	
    Vehicle(){
    	System.out.println("Vehicle() called");
		this.x = 0;
		this.y = 0;
		this.direction = 0;	
		this.speed = 0;
	}
    
    Vehicle(int x, int y){
    	this();
    	System.out.println("Vehicle(x, y) called");
		this.x = x;
		this.y = y;
	}
    
	Vehicle(int x, int y, int direction){
		this(x,y);
		System.out.println("Vehicle(x, y, direction) called");
		this.direction = direction;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public void move(int amount){
		this.x = x+1;
		//System.out.println(x);
	}
    public void turn(int amount){
    	amount = amount + this.direction;		
	}
    public abstract void accelerate();
    public abstract void brake();
    
    }