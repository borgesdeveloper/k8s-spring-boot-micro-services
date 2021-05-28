package com.ms.coffee.resources.users;

import com.ms.coffee.domain.users.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserResource extends PagingAndSortingRepository<User, String> { }
