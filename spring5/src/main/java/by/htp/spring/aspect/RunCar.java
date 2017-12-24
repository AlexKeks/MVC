package by.htp.spring.aspect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component("runCar")
public class RunCar{

    @Pointcut("execution(* by.htp.spring.person.Person.run())")
    public void pointRunCar() {
    }

    @Before("pointRunCar()")
    public void beforeRun() {
        System.out.println("before run: check car.");
    }

    @After("pointRunCar()")
    public void afterRun() {
        System.out.println("after run: stop car.");
    }


}
