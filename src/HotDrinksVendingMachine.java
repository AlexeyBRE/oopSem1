import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    List<HotDrinks> hotDrinks;

    public HotDrinksVendingMachine(List<HotDrinks> hotDrinksVendingMachine) {
        this.hotDrinks = hotDrinksVendingMachine;
    }

    public List<HotDrinks> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public Product getProduct(String name){
        for (HotDrinks item: hotDrinks) {
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }
    public Product getProduct(String name, int temperature){
        for (HotDrinks drinks: hotDrinks) {
            if (drinks.getName().equals(name) && drinks.getTemperature() == temperature){
                return drinks;
            }
        }
        return null;
    }
    public void getHotDrink(HotDrinks hotDrink){

        this.hotDrinks.add(hotDrink);
    }

}
