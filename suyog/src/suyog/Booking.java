package suyog;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

class Bookmethods
{
	String Brand,FName,LName,car,sql,Address; //variable for store values
	double price;
	
	//object for connection
	Connection con = null;
	PreparedStatement p = null;
	ResultSet rs = null;
	
	public Bookmethods() throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");//driver	
	}
	
	public void Hyundai() throws SQLException //method1
	{
		Scanner sc = new Scanner(System.in);//create a object for scanner class
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","");
		
		Brand = "Hyundai";
		System.out.println("Enter the Customer First Name:"); //get input from user
		FName = sc.next();
		System.out.println("Enter the Customer Last Name:");
		LName = sc.next();
		System.out.println("Enter the Customer Address");
		 Address=sc.next();
		
		System.out.println("Choose 1 for Creta ");
		System.out.println("Choose 2 for i10 ");
		System.out.println("Choose 3 for Aura");
		int choose = sc.nextInt();
		switch(choose)
		{
		case 1:
			car = "Creta";
			p = con.prepareStatement("Select Price from carstable  where Model_Name = 'Hyundai Creta'");
			rs = p.executeQuery();
			while(rs.next())
			{
			   price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		case 2:
			car="i10";
			p = con.prepareStatement("Select Price from carstable  where Model_Name = 'Hyundai i10'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;

		case 3:
			car="Aura";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Hyundai Aura'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		default:
			System.out.println("Please press correct option");
		}
		try
		{
		sql = "insert into Booking (FName,LName,Brand,car,Price,Address) values (?,?,?,?,?,?)";
		p = con.prepareStatement(sql);
		con.setAutoCommit(false);
		
		p.setString(1, FName); //it has used to store in database
		p.setString(2, LName);
		p.setString(3, Brand);
		p.setString(4,car);
		p.setDouble(5, price);
		p.setString(6, Address);
		p.addBatch();
		int[] count = p.executeBatch();
		con.commit();
		printRows(p);
	}
		catch(SQLException e)
		{
			System.out.println("Duplicate values not allowed");
		}
		p.close();
		con.close();
		sc.close();
	}
	
	public void Honda() throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","");
		
		Brand = "Honda";
		System.out.println("Enter the Customer First Name:");
		FName = sc.next();
		System.out.println("Enter the Customer Last Name:");
		LName = sc.next();
		System.out.println("Enter the Customer Address");
		 Address=sc.next();
		
		System.out.println("Choose 1 for City ");
		System.out.println("Choose 2 for Jazz");
		System.out.println("Choose 3 for Amaze");
		int choose = sc.nextInt();
		switch(choose)
		{
		case 1:
			car = "City";
			p = con.prepareStatement("Select Price from cars.carstable where Model_Name = 'Honda City'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		case 2:
			car="Jazz";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Honda Jazz'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;

		case 3:
			car="Amaze";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Honda Amaze'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		default:
			System.out.println("Please press correct option");
		}
		try
		{
		sql = "insert into Booking (FName,LName,Brand,car,Price,Address) values (?,?,?,?,?,?)";
		p = con.prepareStatement(sql);
		con.setAutoCommit(false);
		
		p.setString(1, FName);
		p.setString(2, LName);
		p.setString(3, Brand);
		p.setString(4,car);
		p.setDouble(5, price);
		p.setString(6, Address);
		p.addBatch();
		int[] count = p.executeBatch();
		con.commit();
		printRows(p);
		}
		catch(SQLException e)
		{
			System.out.println("Duplicate values not allowed");
		}
		  
		p.close();
		con.close();
		sc.close();
	}
	
	
	public void Toyota() throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","");
		
		Brand = "Toyota";
		System.out.println("Enter the Customer First Name:");
		FName = sc.next();
		System.out.println("Enter the Customer Last Name:");
		LName = sc.next();
		System.out.println("Enter the Customer Address");
		 Address=sc.next();
		
		System.out.println("Choose 1 for Innova Crysta ");
		System.out.println("Choose 2 for Fortuner ");
		System.out.println("Choose 3 for Liva");
		int choose = sc.nextInt();
		switch(choose)
		{
		case 1:
			car = "Innova Crysta ";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Toyota Innova Crysta'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		case 2:
			car="Fortuner";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Toyota Fortuner'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;

		case 3:
			car="Liva";
			p = con.prepareStatement("Select Price from cars.carstable  where Model_Name = 'Toyota Liva'");
			rs = p.executeQuery();
			while(rs.next())
			{
				price = rs.getDouble("Price");
			}
			System.out.println(price);
			p.close();
			rs.close();
			break;
		default:
			System.out.println("Please press correct option");
		}
		
		try {
		sql = "insert into Booking (FName,LName,Brand,car,Price,Address) values (?,?,?,?,?,?)";
		p = con.prepareStatement(sql);
		con.setAutoCommit(false);
		
		p.setString(1, FName);
		p.setString(2, LName);
		p.setString(3, Brand);
		p.setString(4,car);
		p.setDouble(5, price);
		p.setString(6, Address);
		p.addBatch();
		int[] count = p.executeBatch();
		
		con.commit();
		printRows(p);
		}
		catch(SQLException e)
		{
			System.out.println("Duplicate values not allowed");
		}
		  
		p.close();
		con.close();
		sc.close();
	}
	

	private void printRows(PreparedStatement p2) throws SQLException {//this method is usedto display data store in booking table
		// TODO Auto-generated method stub
		String sqlquery = "Select * from Booking ORDER BY id DESC LIMIT 1";
		ResultSet rs = p2.executeQuery(sqlquery);
		
		while(rs.next())
		{
			int id = rs.getInt("id");
			String FirstName = rs.getString("FName"); //
			String LastName = rs.getString("Lname");
			String BrandName = rs.getString("Brand");
			String car = rs.getString("car");
			double Price = rs.getDouble("Price");
			String Address = rs.getString("Address");
			
			System.out.println("Customer's Id: "+id);
			System.out.println("First name of the Customer: "+FirstName);
			System.out.println("Last name of the Customer: "+LastName);
			System.out.println("Brand Name: "+BrandName);
			System.out.println("Name of the car: "+car);
			System.out.println("Price of the car: "+Price);
			System.out.println("Address of the Customer: "+Address);
			System.out.println();
		}
		rs.close();
		p2.close();
	}
}

public class Booking {

	public static void main(String[] args) throws Exception {
		
		Bookmethods b = new Bookmethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 for Hyundai");
		System.out.println("Enter the 2 for Honda ");
		System.out.println("Enter the 3 for Toyota");
		System.out.println("Enter the 4 for Back in Main Menu");
		int Choose = sc.nextInt();
		
		switch(Choose)
		{
		case 1:
			b.Hyundai();                //1
			break;
		case 2:
			b.Honda();                     //2
			break;
		case 3:
			b.Toyota();
			break;
		case 4:
			suyog.front.main(args);             //3
		default:
			System.out.println("please enter valid option");
			suyog.Booking.main(args);
		}
		
		sc.close();
		
		
	}
}
