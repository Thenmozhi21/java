package daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;

import dao.OrdersDao;
import entity.Books;
import entity.Orders;

public class OrdersDaoImpl implements OrdersDao
{

	@Override
	public void AddOrders() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Order_Id :");
		int id=s.nextInt();
		System.out.println("Enter CustomerName :");
		String cname=s.next();
		System.out.println("Enter CustomerPhone :");
		String cphone=s.next();
		System.out.println("Enter BooksPurchased :");
		String bp=s.next();
		System.out.println("Enter TotalPrice :");
		double tprice=s.nextDouble();
		
		Orders o = new Orders();
		o.setOrderId(id);
		o.setCustomerName(cname);
		o.setCustomerPhone(cphone);
		o.setBooksPurchased(bp);
		o.setTotalPrice(tprice);

		session.save(o);
		t.commit();
		System.out.println("ORDER DETAILS ADDED SUCCESSFULLY");
		session.close();
		
	}

	@Override
	public void UpdateOrders() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Order_Id :");
		int id=s.nextInt();
		Orders o1 =session.get(Orders.class, id);
		System.out.println("Enter CustomerName :");
		String cname=s.next();
		System.out.println("Enter CustomerPhone :");
		String cphone=s.next();
		System.out.println("Enter BooksPurchased :");
		String bp=s.next();
		System.out.println("Enter TotalPrice :");
		double tprice=s.nextDouble();
		
		o1.setCustomerName(cname);
		o1.setCustomerPhone(cphone);
		o1.setBooksPurchased(bp);
		o1.setTotalPrice(tprice);
		session.save(o1);
		t.commit();
		System.out.println("ORDER DETAILS UPDATED SUCCESSFULLY");
		session.close();
	}

	@Override
	public void DeleteOrders() 
	{

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Order_Id :");
		int id=s.nextInt();
		Orders o2 =session.get(Orders.class, id);
		session.delete(o2);
		t.commit();
		System.out.println("ORDER DETAILS DELETED SUCCESSFULLY");
		session.close();
		
	}

	@Override
	public void ShowOrderDetails() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Order_Id :");
		int id=s.nextInt();
		Orders o3 =session.get(Orders.class, id);
		System.out.println(" Order Id :"+o3.getOrderId()+" Customer Name :"+o3.getCustomerName()
		+" Customer Phone :"+o3.getCustomerPhone()+" Books Purchased :"+o3.getBooksPurchased()+" Total Price :"+o3.getTotalPrice());
		
	}

}
