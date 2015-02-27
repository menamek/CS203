
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guineaPig p= new guineaPig();
		Scientist s= new Scientist();
		p.setName("mena");
		int x=6;
		
		
		System.out.println(p.getName());
		System.out.println(x);
		
		
		s.changeThese(x,p );
		
		System.out.println(p.getName());
		System.out.println(x);
		
		
	}

}
