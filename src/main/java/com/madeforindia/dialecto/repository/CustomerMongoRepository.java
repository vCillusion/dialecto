package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Customer;

public interface CustomerMongoRepository extends  MongoRepository<Customer, String> {
}     