import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinks h1 = new HotDrinks("teaGreen",0.25, 40);
        HotDrinks h2 = new HotDrinks("teaBlack",0.3, 50);
        HotDrinks h3 = new HotDrinks("coffeeEspresso",0.25, 60);
        HotDrinks h4 = new HotDrinks("coffeeLatte",0.4, 30);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(new ArrayList<>());
        vendingMachine.getHotDrink(h1);
        vendingMachine.getHotDrink(h2);
        vendingMachine.getHotDrink(h3);
        vendingMachine.getHotDrink(h4);
        System.out.println(vendingMachine.getProduct("teaBlack"));
        System.out.println(vendingMachine.getProduct("coffeeEspresso",60));

    }
}