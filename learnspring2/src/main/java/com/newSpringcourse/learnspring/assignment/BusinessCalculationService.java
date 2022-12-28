package com.newSpringcourse.learnspring.assignment;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class BusinessCalculationService {
	private DataService dataservice;
	
	public BusinessCalculationService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findmax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}

}
