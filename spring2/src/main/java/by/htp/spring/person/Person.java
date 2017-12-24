package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements InitializingBean {

    private Integer id;
    private String name;
    private String surname;
    private Map<String,String> pets;
    private Collection<Car> cars;
    private Map<Integer, String> houses;
    private IAddress address;

    public String getStreet(){
        return address.getStreet();
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("init person");

    }
    public String getHouse(int n){
        return  houses.get(n);
    }

    public String getPet(String n){
        return pets.get(n);
    }


}
