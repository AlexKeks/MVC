package by.htp.spring.notifier;

import by.htp.spring.person.Car;
import by.htp.spring.person.CarFactory;
import by.htp.spring.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLoader {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
        Person person = context.getBean("person", Person.class);
        Car cars = context.getBean("cars", Car.class);
        CarFactory carF = context.getBean("carFactory", CarFactory.class);
        System.out.println("Name is: " + person.getName() + "\nCars: " + person.getCars()
                + "\nHouse 1: " + person.getHouse(1) +
        "\nPets: " + person.getPet("cat")+ "\nbeanConstr: " + cars.getNameCar() + ", nullYear: " + cars.getYearCar() +"\nSpringExpr"+ carF);


        /*((ClassPathXmlApplicationContext) context).close();*/


    }
}
