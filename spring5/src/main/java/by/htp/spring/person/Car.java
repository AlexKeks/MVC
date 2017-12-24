package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("car")
public class Car implements ICar {
    @Value("BMW")
    private String nameCar;
    @Value("2000")
    private String yearCar;
    @Value("4000")
    private Integer CostOfTheCar;


    public void drive() {
        System.out.println("Drive Car");
    }
}
