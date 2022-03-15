package com.company;

public class Room {
  private String name;
  private String description;
  private Room roomWest;
  private Room roomEast;
  private Room roomNorth;
  private Room roomSouth;


  public Room(String name, String description){
    this.name = name;
    this.description = description;
  }

  public void setWest(Room room){
    roomWest = room;
  }

  public void setNorth(Room room){
    roomNorth = room;
  }

  public void setEast(Room room){
    roomEast = room;
  }

  public void setSouth(Room room){
    roomSouth = room;
  }

}