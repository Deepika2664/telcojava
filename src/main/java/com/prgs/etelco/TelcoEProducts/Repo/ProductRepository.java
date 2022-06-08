package com.prgs.etelco.TelcoEProducts.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prgs.etelco.TelcoEProducts.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}


/*To get all this free functionality, all we had to do was declare an interface which extends Spring Data JPA’s JpaRepository, specifying the domain type as Employee and the id type as Long.

Spring Data’s repository solution makes it possible to sidestep data store specifics and instead solve a majority of problems using domain-specific terminology.*/