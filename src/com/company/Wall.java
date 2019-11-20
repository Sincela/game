package com.company;

public class Wall implements Types{
  public ObjectType getObjectType(){
    return ObjectType.Wall;
  }
  public String toString(){
    return "*";
  }
}
