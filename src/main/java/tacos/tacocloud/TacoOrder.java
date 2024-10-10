package tacos.tacocloud;

import java.util.ArrayList;
import java.util.List;

public record TacoOrder(String deliveryName, String deliveryStreet, String deliveryCity, String deliveryState,
                        String deliveryZip, String ccNumber, String ccExpiration, String ccCVV, List<Taco> tacos) {

    public TacoOrder() {
        this("", "", "", "", "", "", "", "", new ArrayList<>());
    }

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
