package org.example.chefanditems.services;

import org.example.chefanditems.model.Chef;

import java.util.List;

public interface ChefService {
    Chef createChef(Chef chef);
    Chef getChefById(String id);
    void deleteChefById(String id);
    List<Chef> getAllChefs();
    Chef updateChefById(String id,Chef Chef);
}
