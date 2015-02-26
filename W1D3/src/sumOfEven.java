
public class sumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3, 8, 4, 10, 14, 5, 21};
		int sum=0;
		for(int i=0;i<nums.length;i++){
		if (nums[i]%2==0){
				sum=nums[i]+sum;
								
			}
		}
		System.out.println("yes that’s"+" " +sum);

	}
}
	


