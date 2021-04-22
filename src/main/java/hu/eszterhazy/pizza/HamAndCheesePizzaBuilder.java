package hu.eszterhazy.pizza;

import java.util.ArrayList;
import java.util.List;

public class HamAndCheesePizzaBuilder extends PizzaBuilderImpl{
    List<Ingredient> ingredientList= new ArrayList<>();

    @Override
    public Pizza build() {
        ingredientList.add(new Ham());
        ingredientList.add(new Cheese());
        ingredientList.addAll(super.ingredientList);
        return new Pizza(ingredientList);
    }
}
