package by.htp.spring.notifier;


import by.htp.spring.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLoader {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
        Person person = context.getBean("person", Person.class);


        System.out.println("autowire\"byTypeOrByName\" - Address(street): "
                        + person.getStreet() + "\n@Qualifier: " + person.getCar()+"\ncarOptionalAutowired and @ICarAnnotated - " + person.getCarOptionalAutowired()
                + "\n@NamedOrProvider - " + person.getPets() + "\n@Value - " + person.getCatValue()
                );


        /*((ClassPathXmlApplicationContext) context).close();*/


    }
}
