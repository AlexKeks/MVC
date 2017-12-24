package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements IAddress {
    private Long id;
    private String flat;
    private String street;
    private String city;
    private String country;

    public String getStreet() {
        return street;
    }

    private static Address getInstance() {
        return new Address();
    }
    public void init(){
        System.out.println("init address");
    }
    public void destroy(){
        System.out.println("destroy address");
    }
}
