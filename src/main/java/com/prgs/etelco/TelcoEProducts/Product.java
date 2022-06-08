package com.prgs.etelco.TelcoEProducts;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public
class Product {
	
	private @Id @GeneratedValue Long productId; 
	private String productName; // iphone,samsung,googlepixel
	private String productModel; // iphone (SE,10,12..) samsung (galaxy ...) googlepixel (4, 4XL, 4A, 5, 5A...)
	
	Product() {}
	public Product(String productName , String productModel){
		
		this.productName = productName;
		this.productModel = productModel;
			}
	 
	public Long getProductId() {
		    return this.productId;
		  }

		  public String getProductName() {
		    return this.productName;
		  }

		  public String getProductModel() {
		    return this.productModel;
		  }

		  public void setProductId(Long productId) {
		    this.productId = productId;
		  }

		  public void setProductName(String productName) {
		    this.productName = productName;
		  }

		  public void setProductModel(String productModel) {
		    this.productModel = productModel;
		  }
		  @Override
		  public boolean equals(Object o) {

		    if (this == o)
		      return true;
		    if (!(o instanceof Product))
		      return false;
		    Product product = (Product) o;
		    return Objects.equals(this.productId, product.productId) && Objects.equals(this.productName, product.productName)
		        && Objects.equals(this.productModel, product.productModel);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(this.productId, this.productName, this.productModel);
		  }

		  @Override
		  public String toString() {
		    return "Product{" + "product-id=" + this.productId + ", product-name='" + this.productName + '\'' + ", model='" + this.productModel + '\'' + '}';
		  }

}


/*
package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  Employee() {}

  Employee(String name, String role) {

    this.name = name;
    this.role = role;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getRole() {
    return this.role;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
        && Objects.equals(this.role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
  }
}*/