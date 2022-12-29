package controladores;

public class Foreach {

	public static void main(String[] args) {
		double[] nums = {9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		for (double num: nums) {
			System.out.print(num + " ");
		}
	}

}
