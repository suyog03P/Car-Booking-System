package suyog;
import java.sql.*;
import java.util.Scanner;
public class carsdetail {

	//c starts
	public carsdetail() throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	// c ends
	
    // instance variable declaration starts
	Connection con = null;
	PreparedStatement p = null;
	ResultSet rs = null;
	int Model_Code;
	String Model_Name,Brand_Name;
	double Price;
	// ends
	
	
	//m1 starts
	public void cars(String j) throws SQLException,Exception //parametrized method
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","");
		p = con.prepareStatement("Select * from cars.carstable where Brand_Name = "+ "'" + j+"'");
		
		
		
		rs = p.executeQuery();
		System.out.println("Model Code\t\t"+"Model Name\t\t"+"Brand Name\t\t"+"Price\n");                       //??
		while(rs.next())
		{
			Model_Code = rs.getInt("Model_code");
			Model_Name = rs.getString("Model_Name");
			Brand_Name = rs.getString("Brand_Name");
			Price = rs.getDouble("Price");
			
			System.out.println(Model_Code+"\t\t\t"+Model_Name+"\t\t\t"+Brand_Name+"\t\t\t"+Price);               //??
		} 
		con.close();
		p.close();
		rs.close();
	}
	
	//m1 ends 
	
	
	public static void main(String[] args) throws Exception {     // main method
		Scanner sc =new Scanner(System.in);
		carsdetail cd = new carsdetail();
		
		System.out.println("Select 1 for Hyundai  ");
		System.out.println("Select 2 for Honda");
		System.out.println("Select 3 for Toyota");
		System.out.println("Select 4 for Back Main Menu");
		System.out.println("Select 5 for exit");
		
		System.out.println("if you want to start press any key except 5 if you want to  EXIT press 5");
		int p = sc.nextInt();
	
		while(p!=5) {
			System.out.println("You pressesd a key. To start now enter from above choice to continue");
			int o = sc.nextInt();
			
			
			//
			switch(o){
			case 1:
				cd.cars("Hyundai");
				break;
				
			
			case 2:
				cd.cars("Honda");
				break;
			case 3:
				cd.cars("Toyota");
				break;
			case 4:
				suyog.front.main(args);                                         //
				break;
			default:
				System.out.println("Please enter valid Key");
			}
			//  
			
			System.out.println(" ");
			
			
			System.out.println("if you want to start again press 0 if you want to  EXIT press 5");
			 p = sc.nextInt();
		}
		
		
	try {}
	
		finally{
			System.out.println("Thankyou visit again");
		}

	}

}