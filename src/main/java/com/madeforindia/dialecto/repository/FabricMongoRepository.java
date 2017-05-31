package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Fabric;

public interface FabricMongoRepository extends  MongoRepository<Fabric, String> {
}     