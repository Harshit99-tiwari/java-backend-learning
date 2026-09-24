package org.example;
import org.example.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop d = context.getBean(Desktop.class);
        d.Compile();


        }




       // ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");

      //  Alien obj = context.getBean("alien", Alien.class);
      //  obj.code();
      //  System.out.println(obj.getAge());

       // Computer c = context.getBean(Computer.class);

      //  Desktop d = context.getBean(Desktop.class);



    }
//}
