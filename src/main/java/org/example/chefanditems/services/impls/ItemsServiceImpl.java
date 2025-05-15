package org.example.chefanditems.services.impls;

import org.example.chefanditems.exceptionss.ChefNotFoundException;
import org.example.chefanditems.model.Items;
import org.example.chefanditems.repositories.ItemRepo;
import org.example.chefanditems.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.chefanditems.repositories.ChefRepo;
import org.example.chefanditems.model.Chef;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {
    ItemRepo itemRepo;
    ChefRepo chefRepo;
    @Autowired
    public ItemsServiceImpl(ItemRepo itemRepo, ChefRepo chefRepo) {
        this.itemRepo = itemRepo;
        this.chefRepo = chefRepo;
    }
    @Override
    public Items createItem(Items items) {
        boolean chefExists = chefRepo.existsById(items.getChefId());
        if (!chefExists) {
            throw new ChefNotFoundException(items.getChefId());
        }
        return itemRepo.save(items);
    }


    @Override
    public Items getItemsById(String id) {
        return itemRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteItemById(String id) {
        itemRepo.deleteById(id);
        System.out.println(id + " Deleted");
    }

    @Override
    public Items updateItemById(String id, Items items) {
        return itemRepo.save(items);
    }

    @Override
    public List<Items> getAllItems() {
        return itemRepo.findAll();
    }
}
