package by.htp.spring.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements ICar{


    @Value("Volvo")
   private String make;
    @Value("1995")
   private String year;


    public String run() {
      return   "drive car";
    }
    public String getMake(){
        return make;
    }
}
