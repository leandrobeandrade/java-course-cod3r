package generics.estrutura;

import java.util.TreeSet;

public class ExemploComparable {
	public static void log() {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
	
	/**
	 * TreeSet ordena os valores 
	 */
}
