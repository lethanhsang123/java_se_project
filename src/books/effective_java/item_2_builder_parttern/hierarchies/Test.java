package books.effective_java.item_2_builder_parttern.hierarchies;

public class Test {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .topping(Pizza.Topping.PEPPER)
                .build();

        Calzone calzone = new Calzone.Builder()
                .topping(Pizza.Topping.ONION)
                .topping(Pizza.Topping.MUSHROOM)
                .build();

        System.out.println(pizza.toppings);
    }
}
