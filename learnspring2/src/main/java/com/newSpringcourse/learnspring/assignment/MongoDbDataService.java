package com.newSpringcourse.learnspring.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository   // for classes that talk with retrieve/manipulate database better to use this at place of @Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		
		return new int[] {11,22,33,44,66,55};
	}

}
