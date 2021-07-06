package com.acme.dbo;

import com.acme.dbo.controller.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        ClientController controller = context.getBean(ClientController.class);

        System.out.println("Account operations: create, get, get-by-id");
        Scanner console = new Scanner(System.in);

        while (true) {
            switch (console.next()) {
                case "create":
                    controller.create(console.next());
                    break;
                case "get-by-id":
                    System.out.println(controller.findById(Integer.parseInt(console.next())));
                    break;
                case "get":
                    controller.findAll().forEach(System.out::println);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
