package hu.eszterhazy;

import hu.eszterhazy.pizza.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public void demo(){
//        List<Ingredient> ingredientList = new ArrayList<>();
//        ingredientList.add(new Cheese());
//        ingredientList.add(new Ham());
//        ingredientList.add(new Mushroom());
//        Pizza pizza= new Pizza(ingredientList);

        Pizza pizza = new PizzaBuilderImpl().
                addCheese().
                addHam().
                addMushroom().
                build();
        System.out.println(pizza.toString());

        Pizza pizza1= new HamAndCheesePizzaBuilder()
                .addCheese()
                .addMushroom()
                .build();
        System.out.println(pizza1);
    }


}
