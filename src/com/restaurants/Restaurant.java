package com.restaurants;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.dishes.Dish;

/**
 * Restaurant
 */
public class Restaurant {

    private String location;
    private ArrayList<Dish> menu;
    private double efficency;
    private String name;

    public Restaurant(String location, ArrayList<Dish> menu, double efficency, String name) {
        this.location = location;
        this.menu = menu;
        this.efficency = efficency;
        this.name = name;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Dish> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Dish> menu) {
        this.menu = menu;
    }

    public double getEfficency() {
        return efficency;
    }

    public void setEfficency(double efficency) {
        this.efficency = efficency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}