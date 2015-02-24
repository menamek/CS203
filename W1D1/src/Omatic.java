
public class Omatic {
	public static void main(String []args){
		String[] First={"one","two","three"};
		String[] Second={"1","2","3"};
		String[] Third={"a","b","c"};
		
		int A= First.length;
		int B= Second.length;
		int C= Third.length;
		
		int rand1 = (int) (Math.random() * A);
		int rand2 = (int) (Math.random() * B);
		int rand3 = (int) (Math.random() * C);
		
		String X= First[rand1]+" "+Second[rand2]+" "+Third[rand3];
		System.out.println(X);
				
		}

}
