package org.example.chefanditems.controller;


import org.example.chefanditems.DTO.LoginRequest;
import org.example.chefanditems.model.Chef;
import org.example.chefanditems.repositories.ChefRepo;
import org.example.chefanditems.services.impls.ChefServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @Autowired
    private ChefRepo chefRepo;


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
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {

        Chef chef = chefRepo.findByEmail(loginRequest.getEmail());
        if (chef != null && chef.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful for: " + chef.getName());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }

}
