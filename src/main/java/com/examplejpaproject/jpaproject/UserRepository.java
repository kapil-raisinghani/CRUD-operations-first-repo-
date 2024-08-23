package com.examplejpaproject.jpaproject;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<user, Integer> {
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
}

