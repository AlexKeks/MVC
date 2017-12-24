package by.htp.spring.person;


import by.htp.spring.car.ICar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class Person {

    private String name;
    @Autowired
    private IAddress address;
    @Autowired
    private ICar car;

    public String getMakeCar() {
        return car.getMake();
    }

    public String setStreet1(String country, String city) {
        System.out.println("Person 2 args method");
        return address.setStreet1(country, city);
    }
}
