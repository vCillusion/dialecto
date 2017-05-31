package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Color;

public interface ColorMongoRepository extends  MongoRepository<Color, String> {
}     