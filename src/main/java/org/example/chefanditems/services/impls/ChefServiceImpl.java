package org.example.chefanditems.services.impls;

import org.example.chefanditems.model.Chef;
import org.example.chefanditems.repositories.ChefRepo;
import org.example.chefanditems.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefServiceImpl implements ChefService {
    private ChefRepo chefRepo;

    @Autowired
    public ChefServiceImpl(ChefRepo chefRepo) {
        this.chefRepo = chefRepo;
    }


    @Override
    public Chef createChef(Chef chef) {
       return chefRepo.save(chef);
    }

    @Override
    public Chef getChefById(String id) {
        return chefRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteChefById(String id) {
         chefRepo.deleteById(id);
         System.out.println(id + " Deleted");
    }

    @Override
    public List<Chef> getAllChefs() {
        return chefRepo.findAll();
    }

    @Override
    public Chef updateChefById(String id, Chef Chef) {
        return chefRepo.save(Chef);
    }
}
