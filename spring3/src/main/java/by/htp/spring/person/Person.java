package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.lang.reflect.Array;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person implements InitializingBean {

    @Autowired
    @Qualifier("car1")
    private ICar car;
    @Autowired(required = false)
    @ICarAnnotated
    private ICar carOptionalAutowired;
    @Inject
    @Named("pet2")
    private Set<Pet> pets;
    @Value("#{pet1}")
    private Pet catValue;
    // @Autowired
    @Resource(name = "address")
    private IAddress address;

    public Person(Provider<Pet> addPets) {
        pets = new HashSet<Pet>();
        for (int i = 0; i < 3; i++) {
            pets.add(addPets.get());

        }
    }

    public String getStreet() {
        return address.getStreet();
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("init person");

    }


}
