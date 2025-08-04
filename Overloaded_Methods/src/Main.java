public class Main {
    public static void main(String[] args) {

        //overloaded methods = methods that can share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        String pizza;

        pizza = bakePizza("Thin crust");
        System.out.println(pizza);
        pizza = bakePizza("Thin crust", "Quick melt");
        System.out.println(pizza);
        pizza = bakePizza("Thin crust", "Quick melt", "Hawaiian");
        System.out.println(pizza);

    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese+ " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + "" + bread + " pizza";

    }
}