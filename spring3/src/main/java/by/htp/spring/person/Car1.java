package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car1 implements ICar  {

    private String nameCar;
    private String yearCar;
    private Integer CostOfTheCar;


    public void run() {

    }
}
