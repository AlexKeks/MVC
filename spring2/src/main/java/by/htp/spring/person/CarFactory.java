package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarFactory {

    private boolean eqYAZ;
    private String carName;
    private int newCost;
    private boolean costCar;
    private List<String> carsPerson;
}
