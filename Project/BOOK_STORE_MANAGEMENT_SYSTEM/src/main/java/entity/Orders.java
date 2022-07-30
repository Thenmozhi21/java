package entity;

import javax.persistence.*;

@Table(name="ORDERS_DETAILS")
@Entity
public class Orders 
{
@Id
private int OrderId;
private String CustomerName;
private String CustomerPhone;
private String BooksPurchased;
private double TotalPrice;

public int getOrderId() {
	return OrderId;
}
public void setOrderId(int orderId) {
	OrderId = orderId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getCustomerPhone() {
	return CustomerPhone;
}
public void setCustomerPhone(String customerPhone) {
	CustomerPhone = customerPhone;
}
public String getBooksPurchased() {
	return BooksPurchased;
}
public void setBooksPurchased(String booksPurchased) {
	BooksPurchased = booksPurchased;
}
public double getTotalPrice() {
	return TotalPrice;
}
public void setTotalPrice(double totalPrice) {
	TotalPrice = totalPrice;
}

}
