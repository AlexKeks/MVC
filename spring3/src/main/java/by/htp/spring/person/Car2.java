package by.htp.spring.person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ICarAnnotated
public class Car2 implements ICar {

    private String nameCar;
    private String yearCar;
    private Integer CostOfTheCar;

    public void run() {

    }
}
