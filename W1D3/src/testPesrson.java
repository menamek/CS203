
public class testPesrson {
	public static void main(String []args){
		peson[] per= new peson[5];
		peson p= new peson();
		p.firstname="John Doe";
		per[0]=p;
		per[1]=p;
		per[2]=p;
		per[3]=p;
		per[4]=p;
		
		p.firstname= "John Smith";
		System.out.println(per[0].firstname);
		System.out.println(per[1].firstname);
		System.out.println(per[2].firstname);
		System.out.println(per[3].firstname);
		System.out.println(per[4].firstname);
	}

}
