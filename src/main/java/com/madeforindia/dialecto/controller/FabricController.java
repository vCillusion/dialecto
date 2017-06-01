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

import com.madeforindia.dialecto.model.Fabric;
import com.madeforindia.dialecto.repository.FabricMongoRepository;

@RestController
public class FabricController {

	@Autowired
	private FabricMongoRepository mongoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(path="/fabrics", method = RequestMethod.GET)
	public List<Fabric> findAll() throws IOException {
		return mongoRepository.findAll();
	}
	
	@RequestMapping(path="/fabrics/{id}", method = RequestMethod.GET)
	public List<Fabric> findById(@PathVariable String id) throws IOException {
		
		BasicQuery query1 = new BasicQuery("{ _id : '" + id + "' }");
		return mongoTemplate.find(query1, Fabric.class);
		
	}

	@RequestMapping(value = "/fabrics", method = RequestMethod.POST)
	public int add(@RequestBody Fabric color) {
		
		mongoRepository.save(color);
		return 1;
	}
	
	@RequestMapping(value = "/fabrics/{id}", method = RequestMethod.PUT)
	public int updateById(@PathVariable String id, @RequestBody Fabric color) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Fabric dbColor = mongoTemplate.findOne(query, Fabric.class);
	
		if(dbColor != null){
			color.setId(dbColor.getId());
			mongoRepository.save(color);
			return 1;
		}
		
		return -1;
	}
}
