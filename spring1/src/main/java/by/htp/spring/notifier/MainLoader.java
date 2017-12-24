package by.htp.spring.notifier;/*
package by.htp.spring.notifier;

import by.htp.spring.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLoader {
    public static void main(String[] args){
      //  ApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
       // Person person = context.getBean("person", Person.class);
       // System.out.println(person.getStreet());

    }
}
*/

import java.util.ArrayList;
import java.util.List;

public class MainLoader {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(3);

        b.add(2);
        b.add(4);
        b.add(6);

        a.addAll(b);
        a.
        for( Integer i: a){
            System.out.println(i);
        }





    }

    <T> void merge(ArrayList a, ArrayList b) {
        if (a == null) {
            throw new NullPointerException("listA is null");
        }
        if (b == null) {
            throw new NullPointerException("listB is null");
        } else {


            int size = a.size()+b.size();
            for( int i = 0; i < size - 1; i++ ) {
                a.add( i * 2 + 1, b.get( i ) );
            }



        }

    }
}