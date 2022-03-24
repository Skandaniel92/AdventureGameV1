package com.company;

import java.util.ArrayList;


public class Room {
  private final String name;
  private final String description;
  private final ArrayList<Item> items;

  private Room roomWest;
  private Room roomEast;
  private Room roomNorth;
  private Room roomSouth;


  public Room(String name, String description) {
    this.name = name;
    this.description = description;
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public Item findItem(String itemName) {
    for (Item item : items) {
      if (items.getItem().equals(itemName))
        return item;
    }
    return null;
  }

  public void removeItem(Item item) {
    this.items.remove(item);
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void setWest(Room room) {
    roomWest = room;
  }

  public void setNorth(Room room) {
    roomNorth = room;
  }

  public void setEast(Room room) {
    roomEast = room;
  }

  public void setSouth(Room room) {
    roomSouth = room;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }


}