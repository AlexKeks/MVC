package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String name;
    private String surname;
    private String beanName;
    private IAddress address;

    public String getStreet(){
        return address.getStreet();
    }
}
