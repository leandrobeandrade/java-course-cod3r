package errors;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println(7 / scan.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente...");
			scan.close();
		}
		
		System.out.println("FIM!");
		
	}

}
