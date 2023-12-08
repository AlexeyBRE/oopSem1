public class HotDrinks extends Product{
    private int temperature;


    public HotDrinks(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", cost=" + getVolume() +
                 "temperature= " + temperature + " }";
    }
}
