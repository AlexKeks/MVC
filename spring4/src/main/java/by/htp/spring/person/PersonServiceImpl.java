package by.htp.spring.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private Person person;

    public String getPersonCity() {
        return person.getAddress().getCity();
    }
}
