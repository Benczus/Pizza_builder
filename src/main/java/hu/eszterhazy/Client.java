package hu.eszterhazy;

import hu.eszterhazy.pizza.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public void demo(){
        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(new Cheese());
        ingredientList.add(new Ham());
        ingredientList.add(new Mushroom());
        Pizza pizza= new Pizza(ingredientList);
        System.out.println(pizza.toString());

    }


}
