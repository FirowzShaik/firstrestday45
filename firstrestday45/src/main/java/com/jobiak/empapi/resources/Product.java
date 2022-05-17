package com.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/catalog")
public class Product {
	
	@GetMapping("/mobile")
	public String showCatalog() {
		return new String("Samsung E2FH,Dual Camera,32GB Memory,49,999,I got you ");
	}
	
	@GetMapping("/intro")
	public String introduction() {
		return new String("The#1Manufacturer of Degital Mobile in Asia");
	}
	
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value="modelId")String modelId) {
		return new String(modelId + "is available only in Blue and black colors, can be deliver in 24 hours ");
	}
	
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String searchModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
		return new String(modelId + brand + " currently not available to your location ");
	}

}
