package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.example.Desktop;

@Configuration
@ComponentScan("org.example")
public class AppConfig
{
//    @Bean
//    public Alien alien( @Autowired Computer cmp){  //@Qualifier("laptop") primary alternative
//        Alien obj = new Alien();
//        obj.setAge(26);
//        obj.setCmp(cmp);
//        return obj;
//    }
//    //@Bean(name = {"beast","desk"})
//    @Bean
//  //  @Scope("prototype")
//    @Primary
//     public Desktop desktop(){
//         return new Desktop();
//}
//     @Bean
//     public Laptop laptop(){
//        return new Laptop();
//     }
}
