package books.effective_java.item_3_Enforce_the_singleton_property_with_a_private_constructor_or_an_enum_type;

public class Singleton {

}

class Evils1 {
    public static final Evils1 INSTANCE = new Evils1();
    private Evils1() {}
}

class Evils2 {
    private static final Evils2 INSTANCE = new Evils2();
    private static Evils2 getInstance() { return INSTANCE; }
}

enum Evils3 {
    INSTANCE;
    public void test() {
        System.out.println("..............");
    }
}

// Best solution
class Evils4 {
    private Evils4() {}

    private static class Holder {
        private static final Evils4 INSTANCE = new Evils4();
    }
    public static Evils4 getInstance() { return Holder.INSTANCE; }
}
