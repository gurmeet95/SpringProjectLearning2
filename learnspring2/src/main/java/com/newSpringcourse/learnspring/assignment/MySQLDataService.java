package com.newSpringcourse.learnspring.assignment;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository   // for classes that talk with retrieve/manipulate database better to use this at place of @Component
public class MySQLDataService implements DataService{

	@Override
	public int[] retrieveData() {
		
		return new int[] {1,2,3,4,5};
	}

}
