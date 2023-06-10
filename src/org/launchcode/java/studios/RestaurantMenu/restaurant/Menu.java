package org.launchcode.java.studios.RestaurantMenu.restaurant;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class Menu {
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Menu(String category) {
        this.category = category;
    }

}
