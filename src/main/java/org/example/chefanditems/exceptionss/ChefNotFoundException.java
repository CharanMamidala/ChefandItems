package org.example.chefanditems.exceptionss;

public class ChefNotFoundException extends IllegalArgumentException {
    public ChefNotFoundException(String chefId) {
        super("Invalid chefId: " + chefId);
    }
}