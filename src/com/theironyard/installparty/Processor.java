package com.theironyard.installparty;

import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Processor {
    Map<Object, Object> workOrder = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();

    public void processWorkOrders() {
        moveIt();
        readIt();
    }

    private void moveIt() {
        // move work orders in map from one state to another
    }

    private void readIt() {
        // read the json files into WorkOrders and put in map

        File currentDirectory = new File(".");
        File files[] = currentDirectory.listFiles();

        for (File f : files) {
            if (f.getName().endsWith(".json")) {
                // f is a reference to a json file

                FileReader jsonFile;
                try {
                    jsonFile = new FileReader(f);
                    WorkOrder objectMapper = null;
                    objectMapper = objectMapper.readValue(jsonFile, WorkOrder.class);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                // f.delete(); will delete the file
            }
        }
    }

    public static void main(String args[]) {
        Processor processor = new Processor();

        while (true) {
            processor.processWorkOrders();
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}


