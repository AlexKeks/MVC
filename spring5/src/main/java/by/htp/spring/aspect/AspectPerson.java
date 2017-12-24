package by.htp.spring.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
public class AspectPerson implements MethodInterceptor {
    private static Logger log = Logger.getLogger(String.valueOf(AspectPerson.class));

    @Pointcut("execution(* by.htp.spring.person.Person.doSmth())")
    public void doSm() {
    }


    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] obj = invocation.getArguments();
        String arg = (String) obj[0];
        if (arg == "disable"){
            return "only proxy method";
        }
        System.out.println("proxy method. argsTarget = " + arg);
        return invocation.proceed();
    }



}
