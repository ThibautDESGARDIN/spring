package fr.formation.inti.Spring1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hb = context.getBean("hello",HelloBean.class);
        hb.hello();
        System.out.println(hb.getM());
        context.close();
        
        
    }
}
