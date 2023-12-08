import java.util.List;
import java.util.ArrayList;
public interface VendingMachine {

    Product getProduct(String name);
    Product getProduct(String name,int temperature);
}
