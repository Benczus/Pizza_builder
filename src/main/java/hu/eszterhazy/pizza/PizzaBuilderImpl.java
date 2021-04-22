package hu.eszterhazy.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilderImpl implements PizzaBuilder{
    List<Ingredient> ingredientList = new ArrayList<>();
    @Override
    public PizzaBuilder addCheese() {
        ingredientList.add(new Cheese());
        return this;
    }

    @Override
    public PizzaBuilder addHam() {
        ingredientList.add(new Ham());
        return this;
    }

    @Override
    public PizzaBuilder addMushroom() {
        ingredientList.add(new Mushroom());
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(ingredientList);
    }
}
