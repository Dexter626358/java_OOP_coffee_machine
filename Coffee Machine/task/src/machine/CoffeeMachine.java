package machine;

public class CoffeeMachine {
    static final String START = "Starting to make a coffee";
    static final String GRIND = "Grinding coffee beans";
    static final String BOIl_WATER = "Boiling water";
    static final String MIX_WATER_COFFEE = "Mixing boiled water with crushed coffee beans";
    static final String POUR_COFFEE = "Pouring coffee into the cup";
    static final String POUR_MILK = "Pouring some milk into the cup";
    static final String FINNISH = "Coffee is ready!";

    public static void main(String[] args) {
        System.out.println(START);
        System.out.println(GRIND);
        System.out.println(BOIl_WATER);
        System.out.println(MIX_WATER_COFFEE);
        System.out.println(POUR_COFFEE);
        System.out.println(POUR_MILK);
        System.out.println(FINNISH);
    }
}
