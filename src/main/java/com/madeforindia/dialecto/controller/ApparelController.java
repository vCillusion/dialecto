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

import com.madeforindia.dialecto.model.Apparel;
import com.madeforindia.dialecto.repository.ApparelMongoRepository;

@RestController
public class ApparelController {

	@Autowired
	private ApparelMongoRepository mongoRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(path="/apparel", method = RequestMethod.GET)
	public List<Apparel> findAll() throws IOException {
		return mongoRepository.findAll();
	}
	
	@RequestMapping(path="/apparel/{id}", method = RequestMethod.GET)
	public List<Apparel> findById(@PathVariable String id) throws IOException {
		
		BasicQuery query1 = new BasicQuery("{ _id : '" + id + "' }");
		return mongoTemplate.find(query1, Apparel.class);
		
	}

	@RequestMapping(value = "/apparel", method = RequestMethod.POST)
	public int add(@RequestBody Apparel apparel) {
		
		mongoRepository.save(apparel);
		return 1;
	}
	
	@RequestMapping(value = "/apparel/{id}", method = RequestMethod.PUT)
	public int updateById(@PathVariable String id, @RequestBody Apparel apparel) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		
		Apparel dbApparel = mongoTemplate.findOne(query, Apparel.class);
		if(dbApparel != null){
			apparel.setId(dbApparel.getId());
			mongoRepository.save(dbApparel);
			return 1;
		}
		
		return -1;
	}
}
