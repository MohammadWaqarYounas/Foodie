package com.example.foodie.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    int image;
    String name;
    String description;
    String recipe;
    ArrayList<String> ingredients;
//    ArrayList<Integer> ingredientpicture;

    public Product(int image, String name, String description, String recipe, ArrayList<String> ingredients) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.ingredients = ingredients;
    }

    public Product() {

    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
