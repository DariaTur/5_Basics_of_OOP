package by.epam.training.module5;
/*
 * Задача 2.  
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из 
 * нескольких товаров.
 */
public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		
		Payment.Product product1 = payment.new Product("Boots", 53.4);
		Payment.Product product2 = payment.new Product("T-shirt", 13.73);
		Payment.Product product3 = payment.new Product("Trousers", 25.89);
		Payment.Product product4 = payment.new Product("Heels", 30.95);
		Payment.Product product5 = payment.new Product("Coat", 78.45);
		
		payment.addProduct(product1);
		payment.addProduct(product2);
		payment.addProduct(product3);
		payment.addProduct(product4);
		payment.addProduct(product5);
		
		payment.showCart();
		
	}

}
