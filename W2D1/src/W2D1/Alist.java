package W2D1;
import java.util.ArrayList;

public class Alist {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> menna = new ArrayList<Integer>();
		int sum=0;
		for (int i=1;i<=50;i++){
		int x=(int)(Math.random()*100);
			menna.add(x);
			sum+=x;
			menna.add(sum);
			
		}
		
		System.out.println(sum/menna.size());
		System.out.println(menna.contains(sum));
		System.out.println(menna.indexOf(sum));
		System.out.println(menna.size());
		}
	
	}
	
