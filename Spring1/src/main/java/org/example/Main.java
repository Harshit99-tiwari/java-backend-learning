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
        Alien obj = context.getBean( Alien.class);
        //obj.setAge(25);
        System.out.println(obj.getAge());
        obj.code();



//        Desktop d = context.getBean(Desktop.class);
//        d.Compile();
//
//        Desktop d1 = context.getBean(Desktop.class);
//        d1.Compile();


        }




       // ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");

      //  Alien obj = context.getBean("alien", Alien.class);
      //  obj.code();
      //  System.out.println(obj.getAge());

       // Computer c = context.getBean(Computer.class);

      //  Desktop d = context.getBean(Desktop.class);



    }
//}
