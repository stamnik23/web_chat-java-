/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.realtime;


//import java.util.Map;
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
        //(exclude = { DataSourceAutoConfiguration.class,
        //HibernateJpaAutoConfiguration.class
//})

public class RealTimeWebChat {

    public static void main(String[] args) {
    SpringApplication.run(RealTimeWebChat.class, args);

      /*  SpringApplication app =  new SpringApplication(RealTimeWebChat.class);
        Map<String,Object> map = new HashMap<>();d
        map.put("server.port",8080);
        app.setDefaultProperties(map);
        app.run(args); */
    }
    

}

