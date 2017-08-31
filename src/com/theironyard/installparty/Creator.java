package com.theironyard.installparty;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Creator {
    public void createWorkOrders() {

        Scanner scanner = new Scanner(System.in);

        WorkOrder order = new WorkOrder();

        System.out.println("Enter your name");
        order.senderName = scanner.next();

        System.out.println("What is the Work ID #");
        order.id = scanner.nextInt();

        System.out.println("What's the problem");
        order.description = scanner.next();

//        order.status = File file;

        File file = new File(order.id + ".json");


        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(file, order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        Creator creator = new Creator();
        creator.createWorkOrders();
    }
}
