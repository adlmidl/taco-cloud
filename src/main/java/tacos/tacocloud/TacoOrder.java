package tacos.tacocloud;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccVV;
    private List<Taco> tacos = new ArrayList<>();


    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }

    @Override
    public String toString() {
        return "TacoOrder{" +
                "deliveryName='" + deliveryName + '\'' +
                ", deliveryStreet='" + deliveryStreet + '\'' +
                ", deliveryCity='" + deliveryCity + '\'' +
                ", deliveryState='" + deliveryState + '\'' +
                ", deliveryZip='" + deliveryZip + '\'' +
                ", ccNumber='" + ccNumber + '\'' +
                ", ccExpiration='" + ccExpiration + '\'' +
                ", ccVV='" + ccVV + '\'' +
                ", tacos=" + tacos +
                '}';
    }
}
