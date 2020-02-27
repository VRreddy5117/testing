package com.pracitce.Json;

import com.json.departments.Departments;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.json.Json;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class PhoneNumbersJsonRead {


    static JSONObject jsonObject;
   static  Set<PhoneNumbers> phoneNumbersResult;

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("src\\test\\java\\com\\pracitce\\Json\\practice.json"));

            jsonObject = (JSONObject) obj;
            System.out.println("JSON Response :: " + jsonObject);

            JSONArray JSONArr = (JSONArray) jsonObject.get("phoneNumbers");
             phoneNumbersResult = new LinkedHashSet<>();
            String type ;
            String number ;
            for (int i = 0; i <= JSONArr.size() - 1; i++) {
                JSONObject PhoneNumbersObj = (JSONObject) JSONArr.get(i);
                type = (String) PhoneNumbersObj.get("type");
                number = (String) PhoneNumbersObj.get("number");
                phoneNumbersResult.add(new PhoneNumbers(type, number));

            }


          System.out.println("Departments Result :: " + phoneNumbersResult);

            System.out.println();
            write();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void write() throws IOException {
        try {
          //  FileWriter file = new FileWriter("C:\\Users\\rannem\\Desktop\\Annem.txt");
            FileWriter file = new FileWriter("src\\test\\java\\com\\pracitce\\Json\\Annem.json");

            //src/test/java/com/pracitce/Json/Annem.json
            file.write(phoneNumbersResult.toString());
            file.close();
        } catch (IOException e) {


        }
    }
}