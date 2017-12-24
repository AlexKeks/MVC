package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Address implements IAddress {
    private Long id;
    private String flat;
    @Value("Slavinskogo")
    private String street;
    private String city;
    private String country;


    public String setStreet1(String country, String city) {
        if(country == "Belarus" && city == "Minsk"){
            return street;
        }else
        return "not found";
    }
}
