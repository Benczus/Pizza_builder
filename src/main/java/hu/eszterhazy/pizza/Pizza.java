package hu.eszterhazy.pizza;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@RequiredArgsConstructor
@ToString
public class Pizza {
    private final List<Ingredient> ingredientList;
}