package com.madeforindia.dialecto.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.madeforindia.dialecto.model.Language;

public interface LanguageMongoRepository extends  MongoRepository<Language, String> {
}     