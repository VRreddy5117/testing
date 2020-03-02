package com.json.departments;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

public class DepartmentsJsonRead {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {

            // File -1 Reading
            Object obj = parser.parse(new FileReader("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\test\\" +
                    "java\\com\\json\\departments\\deptJson_1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("File-1 JSON Response :: " + jsonObject);

            // File -2 Reading
            Object comp = parser.parse(new FileReader("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\test\\" +
                    "java\\com\\json\\departments\\deptJson_2.json"));

            JSONObject jsonObj2 = (JSONObject) comp;
            System.out.println("File-2 JSON Response :: " + jsonObj2);



            //convert json to string
            String json1 = jsonObject.toJSONString();
            String json2 = jsonObj2.toJSONString();
            JsonRead jsonRead = new JsonRead();
            jsonRead.getStringRes(json1, json2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

