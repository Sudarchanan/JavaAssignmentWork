package customerEntityAssignment;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		List<Order> orderList = new ArrayList<>();
		List<Customer> customerList = new ArrayList<>();
		
		//Storing Data into respective lists
		StoreData data = new StoreData();
		data.FillList(customerList,productList,orderList);
		
		//“Books” with price > 100
		List<Product> BooksOverPriced  = new ArrayList<>();
		for(Product item: productList) {
			if(item != null && item.getCategory().equalsIgnoreCase("books")  && item.getPrice() > 100) {
				BooksOverPriced.add(item);
			}
		}
		System.out.println("*****“Books” with price > 100*******");
		System.out.println(BooksOverPriced);
		
		
		//Cheapest Book
		double cheapBookValue = Double.MAX_VALUE;
		Product cheapBook = null;
		for(Product item: productList) {
			if(item != null && item.getCategory().equalsIgnoreCase("books")) {
				if(item.getPrice() < cheapBookValue) {
					cheapBookValue = item.getPrice();
					cheapBook = item;
				}
			}
		}
		System.out.println("*****Cheapest Book******");
		System.out.println(cheapBook);
 	}

}
