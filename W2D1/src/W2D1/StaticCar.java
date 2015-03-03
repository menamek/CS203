package W2D1;

public class StaticCar {
	private static int x=0;
	private static int y=0;
		
	public static void setx(StaticCar This,int x) {
        This.x = x;
    }
	public static void sety(StaticCar This, int y) {
        This.y = y;
    }
    
    public static int getX(StaticCar This) {
        return  x;
    }

    public static int getY(StaticCar This) {
        return y;
    }
    
    public static void moveup(StaticCar This,int y){
    	This.y=y+2;
    }
    
    public  static void moveDown(StaticCar This,int y){
    	This.y=y-4;
    }
    
    public static void moveLeft(StaticCar This, int x){
    	This.x=x-2;
    }
    
    public static void moveRight(StaticCar This,int x){
    	This.x=x+4;
    }
    
    public static void  returnLocation(StaticCar This){
    	System.out.println(This.x+" "+This.y);
    }
    

}
