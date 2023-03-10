package com.example.recipe;
  import org.springframework.web.bind.annotation.*;
  import java.util.*;
  import com.example.recipe.RecipeService;

 

// Write your code here
@RestController
public class RecipeController{
RecipeService rs = new RecipeService();

@GetMapping("/recipes")
public ArrayList<Recipe> getRecipes(){
    return rs.getRecipes();
}

@PostMapping("/recipes")
public Recipe addRecipe(@RequestBody Recipe recipe){
    return rs.addRecipe(recipe);
}

@GetMapping("/recipes/{recipeId}")
public Recipe getRecipe(@PathVariable ("recipeId") int recipeId){
    return rs.getRecipe(recipeId);
}

@PutMapping("/recipes/{recipeId}")
public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe){
    return rs.updateRecipe(recipeId,recipe);
}

@DeleteMapping("/recipes/{recipeId}")
public void deleteRecipe(@PathVariable ("recipeId") int recipeId){
    rs.deleteRecipe(recipeId);
}

} 