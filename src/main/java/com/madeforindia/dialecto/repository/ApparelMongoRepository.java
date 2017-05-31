package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Apparel;

public interface ApparelMongoRepository extends  MongoRepository<Apparel, String> {
}     