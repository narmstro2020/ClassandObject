package com.company;

public class Car {
    //class field or class attributes
    //these should be private and we should access them via getter methods
    // and set them with setter methods and/or Constructors
    private String make = "Dodge";
    private String model = "Dart";
    private int year = 1968;

    //Constructor that takes in a make, model, and year and sets them
    //for an object.
    //The Constructor is a method that returns the type of the class "Car" in this case
    //It doesn't need a name because Java understands that if you put
    //public Car(...) then its a constructor method.
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Default Constructor that uses the default field values when making a Car object.
    //If you create your own constructor this one is no longer available by default.
    //If you want to have it then you have to put this in your class code.
    public Car(){

    }

    //getter Methods allow us to control access to an objects internal fields.
    //We only allow the user of the object to see what we want them to see.
    //getter and setter methods are almost always public.
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

}
