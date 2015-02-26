public class testHamster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hamsterAge[] hams = new hamsterAge[100];
		double sum = 0;
		for (int i = 0; i < hams.length; i++) {

			hamsterAge h = new hamsterAge();
			h.age = (Math.random() * 4);
			hams[i] = h;
			sum += h.age;

		}
		System.out.println(sum / hams.length);

	}

}
