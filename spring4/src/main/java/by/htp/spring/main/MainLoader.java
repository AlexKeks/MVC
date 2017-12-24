package by.htp.spring.main;


import by.htp.spring.person.PersonBean;
import by.htp.spring.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.stereotype.Component;

@Component
public class MainLoader {

    @Autowired
    private PersonService ps;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        //AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
       // Person person = context.getBean("person", Person.class);
        // System.out.println("City: " + person.getAddress().getCity()+"\n@Value and Annatation - " + person.getCar());
        appContext.register(PersonBean.class);
        appContext.register(MainLoader.class);
        appContext.getEnvironment().getPropertySources().addLast( new SimpleCommandLinePropertySource(args));
        appContext.refresh();
        appContext.start();
        try {
            MainLoader ml = appContext.getBean(MainLoader.class);
            System.out.println("PersonCity: " + ml.ps.getPersonCity());

        }catch (Exception e){

        }finally {
            appContext.close();
        }
        //((ClassPathXmlApplicationContext) context).close();


    }
}
