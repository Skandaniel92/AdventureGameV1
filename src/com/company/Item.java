package com.company;

public class Item {

    String name;
    String itemDescription;

    public Item(String name, String description) {
        this.name = name;
        this.itemDescription = itemDescription;
    }

    public String getItem() {
        return name;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
