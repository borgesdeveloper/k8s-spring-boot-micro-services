package com.ms.coffee.resources.customers;

import com.ms.coffee.domain.customers.types.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "customer_types", path = "customer_types")
public interface CustomerTypeResource extends PagingAndSortingRepository<CustomerType, String> { }
