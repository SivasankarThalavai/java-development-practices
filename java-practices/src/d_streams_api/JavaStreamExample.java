package d_streams_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamExample {

	private static List<Product> productsList = new ArrayList<Product>();

	public static void main(String[] args) {

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

		// With Java 8 Stream API'S
		withStreamAPI();
	}

	private static void withStreamAPI() {

		// filtering data of list
		List<Product> productPriceList = productsList.stream().filter((product) -> product.getPrice() > 25000)
				.map(temp -> {
					Product newProduct = new Product();
					newProduct.setName(temp.getName());
					newProduct.setPrice(temp.getPrice());
					return newProduct;
				}).collect(Collectors.toList());
		// displaying data
		productPriceList.forEach((newProd) -> System.out.println(newProd.getName() + " - " + newProd.getPrice()));

		// sum All HP Laptops price
		Double totalHPPrice = productsList.stream().filter((product) -> product.getBrand().equalsIgnoreCase("hp"))
				.collect(Collectors.summingDouble(product -> product.getPrice()));
		System.out.println("Total HP LAptops price: " + totalHPPrice);

		// max() method to get max Product price
		Product costliestProdcut = productsList.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out.println("Costliest LAptop is : " + costliestProdcut.getName() + " " + costliestProdcut.getPrice());

		// Collectors.maxBy
		Product costliestLaptop = productsList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))).get();
		System.out.println("Costliest LAptop is : " + costliestLaptop.getName() + " " + costliestLaptop.getPrice());

		// min() method to get max Product price
		Product cheapestProdcut = productsList.stream()
				.min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out
				.println("cheapestProdcut LAptop is : " + cheapestProdcut.getName() + " " + cheapestProdcut.getPrice());

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println("Product List into a Map :  " + productPriceMap);

		// groupby bands
		Map<String, Long> brandWiseCount = productsList.stream()
				.collect(Collectors.groupingBy(Product::getBrand, Collectors.counting()));
		System.out.println(brandWiseCount);

		// display all brands
		System.out.println("All Brands");
		productsList.stream().map(Product::getBrand).distinct().forEach(System.out::println);

		System.out.println("Average PRice of Brands");
		Map<String, Double> avgBrandWisePrice = productsList.stream()
				.collect(Collectors.groupingBy(Product::getBrand, Collectors.averagingDouble(Product::getPrice)));
		System.out.println(avgBrandWisePrice);

	}
}