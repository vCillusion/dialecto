package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Cloth;

public interface ClothMongoRepository extends  MongoRepository<Cloth, String> {
}     