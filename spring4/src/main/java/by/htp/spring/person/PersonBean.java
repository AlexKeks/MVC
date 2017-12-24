package by.htp.spring.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "by.htp.spring.person")
public class PersonBean {
    @Bean(value = "personBean", initMethod = "initPerson")

    public Person person(){
        Person p = new Person();
        return p;
    }
}
