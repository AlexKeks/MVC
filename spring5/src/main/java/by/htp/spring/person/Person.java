package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service("person")
public class Person implements PersonService {

    private Car car = new Car();
    private String address = "without a home";


    public String run() {

        return "Run";
    }

    public String getPersonCity(String country) {
        if (country == "Rossia") {
            address = "Moskov";
            return address;
        } else if (country == "Belarus") {
            address = "Minsk";
            return address;
        }
        return address;
    }

    public String doSmth() {
        return "Do something";
    }

    public void setCarNameYear(String auto, String year) {
        car.setNameCar(auto);
        car.setYearCar(year);
        // return "Succuss! car: " + auto + " " + year;
    }

    public String getCar() {
        return car.toString();
    }
}
