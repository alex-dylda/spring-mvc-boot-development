package com.acme.dbo;

import com.acme.dbo.controller.ClientController;
import com.acme.dbo.domain.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        ClientController controller = context.getBean(ClientController.class);

        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Account operations: create, get, get-by-id");
            switch (console.next()) {
                case "create":
                    System.out.print("Enter client name: ");
                    final String clientName = console.next();
                    final Client createdClient = controller.create(clientName);
                    System.out.println("Client was created successfully. " + createdClient);
                    break;
                case "get-by-id":
                    System.out.print("Enter client id: ");
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
