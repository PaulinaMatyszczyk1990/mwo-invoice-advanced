package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	public void addProduct(Product product) {
		// TODO: implement
	}	
	
	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
		
		if (quantity == 0){
			 throw new IllegalArgumentException ("quantity can`t be empty");
		}
		if (quantity < 0 ){
			 throw new IllegalArgumentException ("quantity can`t be negative");
		}
		
	}
		public BigDecimal getSubtotal() {
		return null;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}
}
