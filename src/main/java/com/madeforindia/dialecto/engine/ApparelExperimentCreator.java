package com.madeforindia.dialecto.engine;

import java.util.ArrayList;
import java.util.Optional;

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
			
			Optional<ModelEntry> englishApparel = apparel.getEntries().stream().filter(item -> item.getLanguage().equals("en")).findFirst();
			if(!englishApparel.isPresent()){
				continue;
			}
			
			Experiment apparelEx = new Experiment();
			Sample apparelSample = new Sample();
			apparelSample.setLanguage("en");
			apparelSample.setValue(englishApparel.get().getSingular());
			apparelEx.setSamples(new ArrayList<Sample>() {{ add(apparelSample); }});
			experiments.add(apparelEx);
			
			// Fabric
			for(Fabric fabric : fabricRepository.findAll()){
				Optional<ModelEntry> englishFabric = fabric.getEntries().stream().filter(item -> item.getLanguage().equals("en")).findFirst();
				if(englishFabric.isPresent()){

					Experiment fabricApparelEx = new Experiment();
					Sample fabricApparelSample = new Sample();
					fabricApparelSample.setLanguage("en");
					fabricApparelSample.setValue(String.format("%s %s", englishFabric.get().getSingular(), englishApparel.get().getSingular()));
					fabricApparelEx.setSamples(new ArrayList<Sample>() {{ add(fabricApparelSample); }});
					experiments.add(fabricApparelEx);
				}
			}
			
			// Color
			for(Color color : colorRepository.findAll()){
				
				Optional<ModelEntry> englishColor = color.getEntries().stream().filter(item -> item.getLanguage().equals("en")).findFirst();
				if(englishColor.isPresent()){

					Experiment colorApparelEx = new Experiment();
					Sample colorApparelSample = new Sample();
					colorApparelSample.setLanguage("en");
					colorApparelSample.setValue(String.format("%s %s", englishColor.get().getSingular(), englishApparel.get().getSingular()));
					colorApparelEx.setSamples(new ArrayList<Sample>() {{ add(colorApparelSample); }});
					experiments.add(colorApparelEx);
				}
				
				// Fabric
				for(Fabric fabric : fabricRepository.findAll()){
					Optional<ModelEntry> englishFabric = fabric.getEntries().stream().filter(item -> item.getLanguage().equals("en")).findFirst();
					if(englishFabric.isPresent()){

						Experiment fabricApparelEx = new Experiment();
						Sample fabricApparelSample = new Sample();
						fabricApparelSample.setLanguage("en");
						fabricApparelSample.setValue(String.format("%s %s %s", englishColor.get().getSingular(), englishFabric.get().getSingular(), 
								englishApparel.get().getSingular()));
						fabricApparelEx.setSamples(new ArrayList<Sample>() {{ add(fabricApparelSample); }});
						experiments.add(fabricApparelEx);
					}
				}
				
			} // Color ends
		} // Apparel ends
		
		category.setExperiments(experiments);
		return category;
	}

}
