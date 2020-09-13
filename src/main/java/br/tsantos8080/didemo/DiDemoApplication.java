package br.tsantos8080.didemo;

import br.tsantos8080.didemo.controllers.ConstructorInjectedController;
import br.tsantos8080.didemo.controllers.MyController;
import br.tsantos8080.didemo.controllers.PropertyInjectedController;
import br.tsantos8080.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.hello());
        System.out.println("Constructor injection: " + ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println("Setter injection: " + ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println("Property injection: " + ctx.getBean(PropertyInjectedController.class).sayHello());
    }

}
