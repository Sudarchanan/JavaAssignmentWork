package customerEntityAssignment;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private long customerId;
	
	public Order() {}
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products,
			long customerId) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customerId = customerId;
	}
	public Order(long l, LocalDate of, LocalDate of2, String string, long m) {
		super();
		this.id= l;
		this.orderDate = of;
		this.deliveryDate = of2;
		this.status = string;
		this.customerId = m;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomer(long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", products=" + products + ", customerId=" + customerId + "]";
	}
	
	

}
