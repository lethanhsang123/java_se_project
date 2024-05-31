package books.effective_java.item_2_builder_parttern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int cat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int cat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int serviceSize, int servings) {
            this.servingSize = serviceSize;
            this.servings = servings;
        }

        public NutritionFacts build(Builder builder) {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.cat = builder.cat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
