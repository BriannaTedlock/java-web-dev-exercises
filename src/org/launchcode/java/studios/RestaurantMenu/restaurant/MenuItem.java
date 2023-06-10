package org.launchcode.java.studios.RestaurantMenu.restaurant;

import java.util.ArrayList;

private ArrayList<Menu> itemsMenu;                  // A class to represent a menu item
public class MenuItem {
    // Fields
    private double price; // The price of the item in dollars
    private String description; // A brief description of the item
    private String category; // The category of the item (appetizer, main course, or dessert)
    private boolean isNew; // A flag to indicate if the item is new or not

    // Constructors
    // A default constructor that sets the fields to some default values
    public MenuItem() {
        price = 0.0;
        description = "";
        category = "";
        isNew = false;
    }

    // A parameterized constructor that takes the values of the fields as arguments
    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    // Methods
    // Getters and setters for the fields
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    // A method to display the menu item in a formatted way
    public void display() {
        System.out.println(description + " (" + category + ")");
        if (isNew) {
            System.out.println("*NEW*");
        }
        System.out.println("$" + price);
        System.out.println();
    }
}

// A class to represent a menu
public class Menu {
    // Fields
    private ArrayList<MenuItem> items; // A list of menu items
    private LocalDate lastUpdated; // The date when the menu was last updated

    // Constructors
    // A default constructor that creates an empty menu and sets the last updated date to today
    public Menu() {
        items = new ArrayList<MenuItem>();
        lastUpdated = LocalDate.now();
    }

    // A parameterized constructor that takes a list of menu items and sets the last updated date to today
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        lastUpdated = LocalDate.now();
    }

    // Methods
    // Getters and setters for the fields
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        lastUpdated = LocalDate.now(); // Update the date whenever the items are changed
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // A method to add a new menu item to the menu and update the date
    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = LocalDate.now();
    }

    // A method to remove a menu item from the menu and update the date
    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }

    // A method to display the menu in a formatted way
    public void display() {
        System.out.println("Menu (last updated on " + lastUpdated + ")");
        System.out.println();
        for (MenuItem item : items) { // Loop through each menu item and display it
            item.display();
        }
    }
}



    private String category;

}