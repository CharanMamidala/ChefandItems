package org.example.chefanditems.services;

import org.example.chefanditems.model.Items;

import java.util.List;

public interface ItemsService {
    Items createItem(Items items);
    Items getItemsById(String id);
    void deleteItemById(String id);
    Items updateItemById(String id,Items items);
    List<Items> getAllItems();
}
