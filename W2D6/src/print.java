import java.lang.*;
public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dec" + "\t" + "Hx" + "\t" + "Oct" + "\t" +"Char");
		for(int i=32; i<=128;i++){     
			System.out.printf("%d\t%X\t%o\t%C\t",i,i,i,i);
			System.out.println();
		 
		}
		
	}

}
