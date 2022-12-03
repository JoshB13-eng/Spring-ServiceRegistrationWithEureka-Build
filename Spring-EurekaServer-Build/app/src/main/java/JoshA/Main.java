/*
 * This Java source file was generated by the Gradle 'init' task.
 */
 
//Eureka  server

package JoshA;


import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import JoshA.DataBox.Fruit;

@SpringBootApplication
@EnableEurekaServer
public class Main extends SpringBootServletInitializer{
    
    public static void main(String[] args){
        
        SpringApplication.run(Main.class, args); 
    }
    
    @Override  protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        
        return application.sources(Main.class);
    }
}



//Enter the below URL on your browser to see front-end of Eureka server
//http://localhost:8761/JoshFruit

//java -jar ./app/build/libs/app-EurekaServer-0.1.0.war