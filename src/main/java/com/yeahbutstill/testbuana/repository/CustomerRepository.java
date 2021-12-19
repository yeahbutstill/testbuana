package com.yeahbutstill.testbuana.repository;

import com.yeahbutstill.testbuana.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
