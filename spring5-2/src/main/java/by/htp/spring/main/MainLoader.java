package by.htp.spring.main;

import by.htp.spring.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLoader {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
        Person person = context.getBean( Person.class);
        System.out.println(person.getMakeCar());
        person.getCar().run();
        System.out.println("Get street: " + person.setStreet1("Belarus", "Minsk"));

    }
}
