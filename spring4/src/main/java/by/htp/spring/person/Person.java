package by.htp.spring.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {

    @Autowired
    @Qualifier("car1")
    private ICar car;
    @Autowired
    @Resource(name = "address")
    private Address address;


    public void initPerson(){
        System.out.println("initPerson");

    }


    public Address getAddress() {
        return address;
    }
}
