package org.example.chefanditems.repositories;

import org.example.chefanditems.model.Items;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepo extends MongoRepository<Items, String> {
}
