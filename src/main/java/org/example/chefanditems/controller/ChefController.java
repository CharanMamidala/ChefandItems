package org.example.chefanditems.controller;


import org.example.chefanditems.model.Chef;
import org.example.chefanditems.services.impls.ChefServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chef")
public class ChefController {
    private ChefServiceImpl chefservice;

    @Autowired
    public ChefController(ChefServiceImpl chefservice) {
        this.chefservice = chefservice;
    }
    @PostMapping("/create")
    public Chef CreateChef(@RequestBody Chef chef){
         return chefservice.createChef(chef);
    }

    @GetMapping("/GetbyID")
    public Chef GetChefbyID(@RequestParam String id){
        return chefservice.getChefById(id);
    }

    @DeleteMapping("/DeletebyID")
    public void DeleteChefbyID(@RequestParam Long id){

    }
}
