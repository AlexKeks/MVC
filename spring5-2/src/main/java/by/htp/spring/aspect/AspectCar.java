package by.htp.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;



@Aspect
@Component
public class AspectCar {
    private static Logger log = Logger.getLogger(AspectCar.class);


    @Pointcut("execution (* by.htp.spring.car.ICar.getMake())")
    public void beforeRunCar() {
    }

    @Pointcut("execution(* by.htp.spring.car.Car.run())")
    public void runCar() {
    }

    @Pointcut("execution(* by.htp.spring.person.Person.setStreet1(String, String)) && args(country, city)")
    public void street(String country,String city){

    }

    @Before("street(c,s)")
    public void setStreet(String c,String s){
        System.out.println("before 2 args. countryArg is: " + c + ", cityArg is: " + s);
    }
    @After("street(a,aa)")
    public void aftet(String a, String aa){
        System.out.println("after 2 args. ");
    }

    @Around("runCar()")
    public void aroundRun(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("around. before drive - check car");
            String result = (String) joinPoint.proceed();
            System.out.println("Status: " + result);
            System.out.println("around. after drive - stop car.");
        } catch (Throwable t) {
            log.info(t);
        }
    }

    @Before("beforeRunCar()")
    public void makeCar() {
        System.out.println("before,   Make car is: ");
        if (log.isDebugEnabled()) {

            log.debug("generating message for " );  }

    }
}
