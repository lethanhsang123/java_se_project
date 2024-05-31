package books.effective_java.item_2_builder_parttern.hierarchies;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T topping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract T self();
    }

    private Pizza(Builder<?> builder) {
        toppings = builder.toppings;
    }
}
