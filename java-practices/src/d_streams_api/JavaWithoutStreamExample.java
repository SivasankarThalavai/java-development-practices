package d_streams_api;

import java.util.ArrayList;
import java.util.List;

public class JavaWithoutStreamExample {

	private static List<Product> productsList = new ArrayList<Product>();

	public static void main(String[] args) {

		// Adding Products
		// Adding Products
		productsList.add(new Product(1, "HP Pavillion", 28000f, "HP"));
		productsList.add(new Product(2, "Lenevo Thinkpad", 78000f, "Lenevo"));
		productsList.add(new Product(3, "Dell lattitude", 68000f, "Dell"));
		productsList.add(new Product(4, "Hp Elitebook", 70000f, "hp"));
		productsList.add(new Product(5, "Apple MAC Air", 120000f, "Apple"));
		productsList.add(new Product(6, "Sony Viao", 18000f, "Sony"));
		productsList.add(new Product(7, "Dell inspiron", 38000f, "Dell"));
		productsList.add(new Product(8, "Lenevo Think Book", 48000f, "Lenevo"));
		productsList.add(new Product(9, "Apple MAC Pro", 190000f, "Apple"));

		// Without Java 8 Stream API'S
		withoutStreamAPI();
	}

	private static void withoutStreamAPI() {
		// without Stream API's
		List<Float> productPriceList = new ArrayList<Float>();
		// filtering data of list
		for (Product product : productsList) {
			if (product.getPrice() > 25000) {
				// adding price to a productPriceList
				productPriceList.add(product.getPrice());
			}
		}

		// displaying data
		for (Float price : productPriceList) {
			System.out.println(price);
		}
	}
}