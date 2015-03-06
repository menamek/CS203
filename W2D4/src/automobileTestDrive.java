import java.util.ArrayList;
public class automobileTestDrive {

	public static void main(String args[]) {
		ArrayList<Automobile> a = new ArrayList<Automobile>();
		Car c1 = new Car("Toyota", "malibu", 1999, "blue", true, 89);
		Car c2 = new Car("Toyota", "malibu", 89);
		Truck t1 = new Truck("Hounda", "Fiat", 2016, "Gracha", 88, true);
		a.add(c1);
		a.add(c2);
		a.add(t1);
		System.out.println("the name of my fancy car:" + c1.getMark());
		System.out.println(a.get(0).getMark());
		System.out.println(a.get(1).getModel());
		System.out.println(a.get(2).getYear());
		
		
		for (Automobile auto : a) {
			System.out.println(auto.getMark());
			System.out.println(auto.getModel());
			System.out.println(auto.getYear());
			System.out.println(auto.getColor());
		}
	}

}
