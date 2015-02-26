public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb = new int[100];

		for (int i = 0; i < numb.length; i++) {
			int x = (int) (Math.random() * 100);
			numb[i] = x;

		}
		int y = numb[0];
		for (int j = 0; j < numb.length; j++) {
			if (numb[j] < y) {
				y = numb[j];
				break;

			}
		}
		System.out.print(y);
	}
}
