package by.htp.spring.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component("address")
public class Address implements IAddress {
    private Long id;
    private String flat;
    @Value("nn")
    private String street;
    @Value("Minsk")
    private String city;
    private String country;


    public String getCity(){
        return city;
    }
}
