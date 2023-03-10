package com.example.recipe;

import java.util.*;

public interface RecipeRepository{
    ArrayList<Recipe> getRecipes();
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(int recipeId);
    Recipe updateRecipe(int recipeId,Recipe recipe);
    void deleteRecipe(int recipeId);
}