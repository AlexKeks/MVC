package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String nameCar;
    private String yearCar;
    private Integer CostOfTheCar;

   /* Car(String nameCar){
        this.nameCar=nameCar;
    }*/

}
