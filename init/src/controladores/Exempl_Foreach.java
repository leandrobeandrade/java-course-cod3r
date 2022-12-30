package controladores;

public class Exempl_Foreach {

	public static void main(String[] args) {
		double[] nums = {9.9, 8.7, 7.2, 9.4};
		
		System.out.print("FOR -     ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		System.out.print("FOREACH - ");
		
		for (double num: nums) {
			System.out.print(num + " ");
		}
	}

}
