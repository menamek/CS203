
public class garageTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g1 = new Garage();
		Car c1 = new Car();		
		c1.setTrunkCapacity(3);
		Truck t1 = new Truck();
		t1.setCarryingCapacity(3);
		item i1 = new item();
		i1.setName("xxx");
		item i2 = new item();
		i2.setName("yyy");
		item i3 = new item();
		i3.setName("zzz");
		
		g1.store(c1);
		g1.store(t1);
		g1.store(i1);
		g1.store(i2);
		g1.store(i3);
		
		System.out.println(g1.retrieve(2).getName());
		
	}

}
