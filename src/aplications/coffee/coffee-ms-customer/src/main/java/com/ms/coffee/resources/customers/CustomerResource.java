package com.ms.coffee.resources.customers;

import com.ms.coffee.domain.customers.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerResource extends CrudRepository<Customer, String> { }
