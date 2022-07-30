package com;

import java.util.Scanner;
import daoImpl.BooksDaoImpl;
import daoImpl.OrdersDaoImpl;

public class TestBulid 
{
    public static void main( String[] args )
    {
    	BooksDaoImpl bd = new BooksDaoImpl();
    	OrdersDaoImpl od = new OrdersDaoImpl();
    	
    	while (true) 
    	{
    		Scanner s = new Scanner(System.in);
    		System.out.println("-------------BookStore Management System-------------");
    		System.out.println("Enter Choice");
    		System.out.println(" 1. Manage Book Details \n 2. Manage Order Details \n 3. Exit");
    		int ch = s.nextInt();	
    		switch (ch) 
    		{
    		case 1:
    			Scanner s1 = new Scanner(System.in);
    			System.out.println("-------------Manage Book Details-------------");
    			System.out.println("Enter Choice");
    			System.out.println(" 1. Add Book Details \n 2. Update Book Details \n 3. Delete Book Details \n 4. Show Book Details \n 5. Exit");
    			int ch1 = s.nextInt();
    			switch (ch1) 
    			{
    			case 1:
    				bd.AddBooks();
    				break;
    	        case 2:
    				bd.UpdateBooks();
    				break;
    	        case 3:
    		        bd.DeleteBooks();
    		    break;
    	        case 4:
    	        	bd.ShowBookDetails();
    		    break;
    	        case 5:
    	        	System.out.println("Thank You!!!");
    		        System.exit(0);
    		    
    			}
    			break;
    	    case 2:
    	    	Scanner s2 = new Scanner(System.in);
    			System.out.println("-------------Manage Order Details-------------");
    			System.out.println("Enter Choice");
    			System.out.println(" 1. Add Order Details \n 2. Update Order Details \n 3. Delete Order Details \n 4. Show Order Details \n 5. Exit");
    			int ch2 = s.nextInt();
    			switch (ch2) 
    			{
    			case 1:
    				od.AddOrders();
    				break;
    	        case 2:
    				od.UpdateOrders();
    				break;
    	        case 3:
    		        od.DeleteOrders();
    		    break;
    	        case 4:
    	        	od.ShowOrderDetails();
    		    break;
    	        case 5:
    	        	System.out.println("Thank You!!!");
    		        System.exit(0);
    		    
    			}
    			break;
    	    case 3:
    	    	System.out.println("Thank You!!!");
    	        System.exit(0);
    		
    		}
    	}
    	
    }
}
