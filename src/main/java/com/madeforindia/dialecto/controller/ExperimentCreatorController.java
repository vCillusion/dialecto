package com.madeforindia.dialecto.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madeforindia.dialecto.engine.ExperimentCreator;
import com.madeforindia.dialecto.model.Category;

@RestController
public class ExperimentCreatorController {

	@Autowired
    @Qualifier("ApparelExperimentCreator") 
	private ExperimentCreator apparelExperimentCreater;
	
	@Autowired
	private CategoryController categoryController;
	
	@RequestMapping(path="/categories/apparel", method = RequestMethod.GET)
	public Category findAll() throws IOException {
		return apparelExperimentCreater.Create();
	}
	
	@RequestMapping(path="/categories/apparel", method = RequestMethod.POST)
	public int addApparel() throws IOException {
		Category apparel = apparelExperimentCreater.Create();
		return categoryController.add(apparel);
		
	}
}
