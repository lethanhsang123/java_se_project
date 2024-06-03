package books.effective_java.item_2_builder_parttern.hierarchies;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = false;
            return self();
        }
        @Override
        Calzone build() {
            return new Calzone(self());
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

}
