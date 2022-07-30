package daoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import dao.BooksDao;
import entity.Books;

public class BooksDaoImpl implements BooksDao
{

	@Override
	public void AddBooks() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Create Book_Id :");
		int id=s.nextInt();
		System.out.println("Create Book_Title :");
		String title=s.next();
		System.out.println("Create Book_Author :");
		String author=s.next();
		System.out.println("Create Book_Genre :");
		String genre=s.next();
		System.out.println("Create Book_Price :");
		double price=s.nextDouble();
		
		Books b= new Books();
		b.setId(id);
		b.setTitle(title);
		b.setAuthor(author);
		b.setGenre(genre);
		b.setPrice(price);

		session.save(b);
		t.commit();
		System.out.println("BOOK DETAILS ADDED SUCCESSFULLY");
		session.close();
		
	}

	@Override
	public void UpdateBooks()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Book_Id :");
		int id=s.nextInt();
		Books b1 =session.get(Books.class, id);
		System.out.println("Create Book_Title :");
		String title=s.next();
		System.out.println("Create Book_Author :");
		String author=s.next();
		System.out.println("Create Book_Genre :");
		String genre=s.next();
		System.out.println("Create Book_Price :");
		double price=s.nextDouble();
		
		b1.setTitle(title);
		b1.setAuthor(author);
		b1.setGenre(genre);
		b1.setPrice(price);
		session.update(b1);
		t.commit();
		System.out.println("BOOK DETAILS UPDATED SUCCESSFULLY");
		session.close();
	}

	@Override
	public void DeleteBooks() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Book_Id :");
		int id=s.nextInt();
		Books b2 =session.get(Books.class, id);
		session.delete(b2);
		t.commit();
		System.out.println("BOOK DETAILS DELETED SUCCESSFULLY");
		session.close();
	}

	@Override
	public void ShowBookDetails() 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Book_Id :");
		int id=s.nextInt();
		Books b3 = session.get(Books.class,id);
		System.out.println(" Book Id :"+b3.getId()+" Book Title :"+b3.getTitle()
		+" Book Author :"+b3.getAuthor()+" Book Genre :"+b3.getGenre()+" Book Price :"+b3.getPrice());
	}

}
