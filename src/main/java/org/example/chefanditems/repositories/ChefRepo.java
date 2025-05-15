package org.example.chefanditems.repositories;

import org.example.chefanditems.model.Chef;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChefRepo extends MongoRepository<Chef, String> {
}
