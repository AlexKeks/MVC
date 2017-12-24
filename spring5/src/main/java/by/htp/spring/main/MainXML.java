package by.htp.spring.main;

import by.htp.spring.aspect.AspectPerson;
import by.htp.spring.aspect.RunCar;
import by.htp.spring.person.Person;
import by.htp.spring.person.PersonService;
import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {

    private static PersonService target;
    private static PersonService ps;
    private static PersonService rc;


    public static void init() {
        target = new Person();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new AspectPerson());
        pf.setTarget(target);
        ps = (PersonService) pf.getProxy();

    }

    public static void main(String[] args) {

        init();
        System.out.println(target.run());
        System.out.println("Person city is " + ps.getPersonCity("Belarus"));
        System.out.println("disable: " + ps.getPersonCity("disable"));

    }
}
