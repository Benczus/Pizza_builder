package hu.eszterhazy.pizza;

public interface PizzaBuilder {
    PizzaBuilder addCheese();
    PizzaBuilder addHam();
    PizzaBuilder addMushroom();
    Pizza build();
}
