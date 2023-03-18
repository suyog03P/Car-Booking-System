package suyog;

import java.sql.SQLException;
import java.util.Scanner;

public class front{

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WELLCOME TO SUYOG MOTOR'S");
		System.out.println();
		System.out.println("Enter the 1 for Car Details");
		System.out.println("Enter the 2 for Booking");
		
		int choose = sc.nextInt();
		
		switch(choose)
		{
		case 1:
			suyog.carsdetail.main(args);
			break;
		case 2:
			suyog.Booking.main(args);
			break;
		
			
		}
		sc.close();
	}
}