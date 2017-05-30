package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Category;

public interface CategoryMongoRepository extends  MongoRepository<Category, String> {
}     