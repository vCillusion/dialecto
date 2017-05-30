package com.madeforindia.dialecto.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madeforindia.dialecto.model.Cloth;
import com.madeforindia.dialecto.repository.ClothMongoRepository;

@RestController
public class ClothController {

	@Autowired
	private ClothMongoRepository mongoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(path="/clothes", method = RequestMethod.GET)
	public List<Cloth> findAll() throws IOException {
		return mongoRepository.findAll();
	}
	
	@RequestMapping(path="/clothes/{id}", method = RequestMethod.GET)
	public List<Cloth> findByEnglish(@PathVariable String id) throws IOException {
		
		BasicQuery query1 = new BasicQuery("{ _id : '" + id + "' }");
		return mongoTemplate.find(query1, Cloth.class);
		
	}

	@RequestMapping(value = "/clothes", method = RequestMethod.POST)
	public int save(@RequestBody Cloth color) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("english").is(color.getEnglish()));
		Cloth dbColor = mongoTemplate.findOne(query, Cloth.class);
		if(dbColor != null){
			return -1;
		}
		
		mongoRepository.save(color);
		return -1;
	}
	
	@RequestMapping(value = "/clothes/{id}", method = RequestMethod.PUT)
	public int updateByEnglish(@PathVariable String id, @RequestBody Cloth color) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Cloth dbColor = mongoTemplate.findOne(query, Cloth.class);
		if(dbColor != null){
			dbColor.setEnglish(color.getEnglish());
			mongoRepository.save(dbColor);
			return 1;
		}
		
		return -1;
	}
}
