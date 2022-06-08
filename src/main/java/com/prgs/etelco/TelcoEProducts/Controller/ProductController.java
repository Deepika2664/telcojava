package com.prgs.etelco.TelcoEProducts.Controller;

import java.util.List;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prgs.etelco.TelcoEProducts.Product;
import com.prgs.etelco.TelcoEProducts.ProductNotFoundException;
import com.prgs.etelco.TelcoEProducts.Repo.ProductRepository;


@RestController
class ProductController {
	


	  
		private final ProductRepository repository;

		  ProductController(ProductRepository repository) {
		    this.repository = repository;
		  }
	  
	  @RequestMapping("/")
	    public String home(){
	        return "Hello World!";
	    }


	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/products")
	  List<Product> all() {
	    return repository.findAll();
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/products")
	  Product newProduct(@RequestBody Product newProduct) {
	    return repository.save(newProduct);
	  }

	  // Single item
	  
	  @GetMapping("/products/{id}")
	 
	  Product one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new ProductNotFoundException(id));
	  }


	  @PutMapping("/products/{id}")
	  Product replaceProduct(@RequestBody Product newProduct, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(product -> {
	        product.setProductName(newProduct.getProductName());
	        product.setProductModel(newProduct.getProductModel());
	        return repository.save(product);
	      })
	      .orElseGet(() -> {
	    	  newProduct.setProductId(id);
	        return repository.save(newProduct);
	      });
	  }

	  @DeleteMapping("/products/{id}")
	void deleteProduct(@PathVariable Long id) {
	//	  return repository.findById(id);
	    repository.deleteById(id);
	    
	  } // no exception handling for product not found , how logging works

}

