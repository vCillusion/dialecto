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

import com.madeforindia.dialecto.model.Color;
import com.madeforindia.dialecto.repository.ColorMongoRepository;

@RestController
public class ColorController {

	@Autowired
	private ColorMongoRepository mongoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(path="/colors", method = RequestMethod.GET)
	public List<Color> findAll() throws IOException {
		return mongoRepository.findAll();
	}
	
	@RequestMapping(path="/colors/{id}", method = RequestMethod.GET)
	public List<Color> findByEnglish(@PathVariable String id) throws IOException {
		
		BasicQuery query1 = new BasicQuery("{ _id : '" + id + "' }");
		return mongoTemplate.find(query1, Color.class);
		
	}

	@RequestMapping(value = "/colors", method = RequestMethod.POST)
	public int save(@RequestBody Color color) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("english").is(color.getEnglish()));
		Color dbColor = mongoTemplate.findOne(query, Color.class);
		if(dbColor != null){
			return -1;
		}
		
		mongoRepository.save(color);
		return -1;
	}
	
	@RequestMapping(value = "/colors/{id}", method = RequestMethod.PUT)
	public int updateByEnglish(@PathVariable String id, @RequestBody Color color) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Color dbColor = mongoTemplate.findOne(query, Color.class);
	
		if(dbColor != null){
			color.setId(dbColor.getId());
			mongoRepository.save(color);
			return 1;
		}
		
		return -1;
	}
}
