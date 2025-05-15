package org.example.chefanditems.controller;

import org.example.chefanditems.model.Items;
import org.example.chefanditems.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemsService itemsService;

    @Autowired
    public ItemController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @PostMapping("/create")
    public Items createItem(@RequestBody Items item) {
        return itemsService.createItem(item);
    }

    @GetMapping("/getById")
    public Items getItemById(@RequestParam String id) {
        return itemsService.getItemsById(id);
    }

    @DeleteMapping("/deleteById")
    public void deleteItemById(@RequestParam String id) {
        itemsService.deleteItemById(id);
    }

    @PutMapping("/updateById")
    public Items updateItemById(@RequestParam String id, @RequestBody Items item) {
        return itemsService.updateItemById(id, item);
    }

    @GetMapping("/getAll")
    public List<Items> getAllItems() {
        return itemsService.getAllItems();
    }
}
