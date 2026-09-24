package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.Desktop;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    //@Bean(name = {"beast","desk"})
    @Bean
     public Desktop desktop(){
         return new Desktop();
}
}
