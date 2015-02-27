
public class GoodDog {
	private int size;
	
	public int getSize(){
		return size;
	}
	
	public int setSize(int s){
		return size=s;
	}
	void bark (){
	if (size > 60){
	System .out.println("wooof! Wooof!");
	}
	else if (size> 14){ 
	System.out.println("Ruff! Ruff!");
	}
	else {
	System .out.println( "Yip! Yip!");
	}
	}
}
