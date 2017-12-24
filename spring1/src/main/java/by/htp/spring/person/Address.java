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
}
