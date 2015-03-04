import java.util.ArrayList;
public class Garage {
	private Automobile x;
	private ArrayList<item> ite=new ArrayList<item>();
	
	public void store(Automobile a) {
		x = a;
	}
	public void store(item i) {
		ite.add(i);
	}
	public Automobile retrieve() {
		return this.x;
	}
	public item retrieve(int index) {
		return ite.get(index);
	}
}
