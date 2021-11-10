package com.dishes;

/**
 * Dish
 */
public class Dish {

    private int timeToCook;
    private String[] ingredients;
    private double cost;
    private double stars;
    private boolean available;
    private String name;
    private String discription;

    public Dish(int timeToCook, String[] ingredients, double cost, double stars, boolean available, String name,
            String discription) {
        this.timeToCook = timeToCook;
        this.ingredients = ingredients;
        this.cost = cost;
        this.stars = stars;
        this.available = available;
        this.name = name;
        this.discription = discription;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(int timeToCook) {
        this.timeToCook = timeToCook;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

}