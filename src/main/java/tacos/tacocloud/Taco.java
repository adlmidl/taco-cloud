package tacos.tacocloud;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Taco {
    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public String toString() {
        return "Taco{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
