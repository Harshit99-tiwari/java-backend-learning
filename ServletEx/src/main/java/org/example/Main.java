package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String args[]) throws LifecycleException {
       System.out.println("hello");
       Tomcat tomcat = new Tomcat();
       tomcat.getConnector();

       Context context = tomcat.addContext("",null);
       tomcat.addServlet(context,"HelloServelet",new HelloServelet());
       context.addServletMappingDecoded("/hello","HelloServelet");

       tomcat.start();
       tomcat.getServer().await();
   }

}
