
public class Car {
	private int x=0;
	private int y=0;
	
	public void setx(int x) {
        this.x = x;
    }
	public void sety(int y) {
        this.y = y;
    }
    
    public int getX() {
        return  x;
    }

    public int getY() {
        return y;
    }
    
    public void moveup(int y){
    	this.y=y+2;
    }
    
    public void moveDown(int y){
    	this.y=y-4;
    }
    
    public void moveLeft(int x){
    	this.x=x-2;
    }
    
    public void moveRight(int x){
    	this.x=x+4;
    }
    
    public void  returnLocation(){
    	System.out.println(this.x+" "+this.y);
    }
    

}
