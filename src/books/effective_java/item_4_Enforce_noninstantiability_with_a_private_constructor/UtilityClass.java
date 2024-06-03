package books.effective_java.item_4_Enforce_noninstantiability_with_a_private_constructor;

// Non instantiable utility class
public class UtilityClass {
    // Suppress default constructor for non instantiability
    private UtilityClass() {}
}
