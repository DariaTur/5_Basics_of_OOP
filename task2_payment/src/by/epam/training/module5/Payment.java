package by.epam.training.module5;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private List<Product> cart;
	
	public Payment() {
		cart = new ArrayList<Product>();
	};
	
	public Payment(List<Product> cart) {
		this.cart = cart;
	}
	
	public void addProduct(Product product) {
		cart.add(product);
	}
	
	public void deleteProduct(Product product) {
		cart.remove(product);
	}
	
	public double sum() {
		double sum = 0.0;
		
		for(int i = 0; i<cart.size(); i++) {
			sum+=cart.get(i).getCost();
		}
		
		return sum;
	}
	
	public List<Product> getCart() {
		return cart;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Payment [cart=" + cart + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Payment other = (Payment) obj;
		if (cart == null) {
			if (other.cart != null) {
				return false;
			}
		} else if (!cart.equals(other.cart)) {
			return false;
		}
		return true;
	}

	public void showCart() {
		for(int i = 0; i<cart.size(); i++) {
			System.out.println("Название товара: "+cart.get(i).getName()+", цена: "+cart.get(i).getCost());
			System.out.println("------------------------------------------------------");
		}
	}
	
	public class Product{
		private String name;
		private double cost;
		
		public Product() {};
		
		public Product(String name, double cost) {
			if(cost>0) {
				this.name = name;
				this.cost = cost;
			} else {
				throw new IllegalArgumentException();
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			if(cost>0) {
				this.cost = cost;
			} else {
				throw new IllegalArgumentException();
			}
			
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", cost=" + cost + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(cost);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Product other = (Product) obj;
			if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost)) {
				return false;
			}
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			return true;
		}

	}
}
