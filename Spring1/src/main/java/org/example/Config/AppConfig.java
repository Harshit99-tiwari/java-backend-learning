package org.example.Config;

import org.example.Alien;
import org.example.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.Desktop;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean
    public Alien alien(@Autowired Computer cmp){
        Alien obj = new Alien();
        obj.setAge(26);
        obj.setCmp(cmp);
        return obj;
    }
    //@Bean(name = {"beast","desk"})
    @Bean
  //  @Scope("prototype")
     public Desktop desktop(){
         return new Desktop();
}
}
