package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.UnknownHostException;
import java.util.ArrayList;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ArrayList<String> dbText = initDatabase();
        final String displayText = makeString(dbText);
        SpringApplication.run(Application.class, args);
    }

    static ArrayList<String> initDatabase() {
        ArrayList<String> dbQuery = new ArrayList<>();
        try {
            dbQuery = Database.createDocument();
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host thrown");
        }
    return dbQuery;
    }

    static String makeString(ArrayList<String> text) {
        String resultString = "";
        for (String s: text) {
            resultString += "<b> " + s + "</b><br/>";
        }
    return resultString;
    }

}
