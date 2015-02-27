
public class TestComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 5;
		short s = 5;
		int i = 5;
		long L= 5;
		float f = 5.0f;
		double d = 5.0;
		
		String s1 = "Mi";
		String s2 = "Mi";
		String s3 = "MiMi";
		
		System.out.println(b == s && s==i && i==L && L==f && f==d);
        System.out.println(s1 == s2);
        System.out.println(s3== s1 + s2);
	}

}
