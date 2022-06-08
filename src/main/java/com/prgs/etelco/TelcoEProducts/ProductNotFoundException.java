package com.prgs.etelco.TelcoEProducts;

public class ProductNotFoundException extends RuntimeException {
	
public ProductNotFoundException(Long id) {
	    super("Could not find product " + id);

}
}

/*class EmployeeNotFoundException extends RuntimeException {

	  EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
	}*/