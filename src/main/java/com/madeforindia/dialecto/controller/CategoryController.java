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

import com.madeforindia.dialecto.model.Category;
import com.madeforindia.dialecto.model.Experiment;
import com.madeforindia.dialecto.repository.CategoryMongoRepository;

@RestController
public class CategoryController {

	@Autowired
	private CategoryMongoRepository mongoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(path="/categories", method = RequestMethod.GET)
	public List<Category> findAll() throws IOException {
		return mongoRepository.findAll();
	}
	
	@RequestMapping(path="/categories/{id}", method = RequestMethod.GET)
	public List<Category> findById(@PathVariable String id) throws IOException {
		
		BasicQuery query1 = new BasicQuery("{ _id : '" + id + "' }");
		return mongoTemplate.find(query1, Category.class);
		
	}

	@RequestMapping(value = "/categories", method = RequestMethod.POST)
	public int add(@RequestBody Category category) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(category.getName()));
		Category dbCategory = mongoTemplate.findOne(query, Category.class);
		if(dbCategory != null){
			category.setId(dbCategory.getId());
		}
		mongoRepository.save(category);
		return 1;
	}
	
	@RequestMapping(value = "/categories/{id}", method = RequestMethod.PUT)
	public int updateById(@PathVariable String id, @RequestBody Category color) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Category dbColor = mongoTemplate.findOne(query, Category.class);
	
		if(dbColor != null){
			dbColor.setName(color.getName());
			mongoRepository.save(dbColor);
			return 1;
		}
		
		return -1;
	}
	
	@RequestMapping(value = "/categories/{id}/experiments", method = RequestMethod.POST)
	public int updateCategory(@PathVariable String id, @RequestBody Experiment e) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Category dbCategory = mongoTemplate.findOne(query, Category.class);
	
		if(dbCategory != null){
			dbCategory.getExperiments().add(e);
			mongoRepository.save(dbCategory);
			return 1;
		}
		
		return -1;
	}
	
	@RequestMapping(value = "/categories/{id}/experiments/{eid}", method = RequestMethod.POST)
	public int updateCategory(@PathVariable String id, @PathVariable String eid, @RequestBody Experiment e) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Category dbCategory = mongoTemplate.findOne(query, Category.class);
	
		if(dbCategory != null){
			boolean updated = false;
			for(Experiment dbEt : dbCategory.getExperiments())
			{
				
			}
			
			if(updated){
				mongoRepository.save(dbCategory);
				return 1;
			}
		}
		
		return -1;
	}
}
