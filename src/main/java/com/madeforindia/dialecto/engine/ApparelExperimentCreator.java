package com.madeforindia.dialecto.engine;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madeforindia.dialecto.model.*;
import com.madeforindia.dialecto.repository.*;

@Component(value = "ApparelExperimentCreator")
public class ApparelExperimentCreator implements ExperimentCreator {

	@Autowired
	private ApparelMongoRepository apparelRepository;
	
	@Autowired
	private ColorMongoRepository colorRepository;
	
	@Autowired
	private FabricMongoRepository fabricRepository;
	
	@Override
	public Category Create() {
		
		// apparel
		// color apparel
		// fabric apparel
		// color fabric apparel
		
		Category category = new Category();
		category.setName("apparel");
		
		ArrayList<Experiment> experiments = new ArrayList<Experiment>();
		
		// Apparel
		for(Apparel apparel : apparelRepository.findAll()){
			
			ModelEntry englishApparel = apparel.getEn();
			if(englishApparel == null){
				continue;
			}
			
			Experiment apparelEx = new Experiment();
			Sample enSample = new Sample();
			enSample.setValue(englishApparel.getSingular());
			apparelEx.setEn(enSample);
			experiments.add(apparelEx);
			
			// Fabric
			for(Fabric fabric : fabricRepository.findAll()){
				ModelEntry englishFabric = fabric.getEn();
				if(englishFabric != null){

					Experiment fabricApparelEx = new Experiment();
					Sample fabricApparelSample = new Sample();
					fabricApparelSample.setValue(String.format("%s %s", englishFabric.getSingular(), englishApparel.getSingular()));
					fabricApparelEx.setEn(fabricApparelSample);
					experiments.add(fabricApparelEx);
				}
			}
			
			// Color
			for(Color color : colorRepository.findAll()){
				
				ModelEntry englishColor = color.getEn();
				if(englishColor != null){

					Experiment colorApparelEx = new Experiment();
					Sample colorApparelSample = new Sample();
					colorApparelSample.setValue(String.format("%s %s", englishColor.getSingular(), englishApparel.getSingular()));
					colorApparelEx.setEn(colorApparelSample);
					experiments.add(colorApparelEx);
				}
				
				// Fabric
				for(Fabric fabric : fabricRepository.findAll()){
					ModelEntry englishFabric = fabric.getEn();
					if(englishFabric != null){

						Experiment fabricApparelEx = new Experiment();
						Sample fabricApparelSample = new Sample();
						fabricApparelSample.setValue(String.format("%s %s %s", englishColor.getSingular(), englishFabric.getSingular(), 
								englishApparel.getSingular()));
						fabricApparelEx.setEn(fabricApparelSample);
						experiments.add(fabricApparelEx);
					}
				}
				
			} // Color ends
		} // Apparel ends
		
		category.setExperiments(experiments);
		return category;
	}

}
