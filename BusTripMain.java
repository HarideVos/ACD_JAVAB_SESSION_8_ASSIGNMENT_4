package eightpointfour;

import java.util.Scanner;

public class BusTripMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BusTripBookingThread t1 = new BusTripBookingThread("Adrian", 1, 1);
		try {
			t1.start();
		}	catch (Exception e){
			System.out.println("Error");
		}
		sc.close();
	}
}
