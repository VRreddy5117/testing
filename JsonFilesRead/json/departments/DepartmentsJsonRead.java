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
            Object obj = parser.parse(new FileReader("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\test\\java\\com\\json\\departments\\department.json"));
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println("JSON Response :: " + jsonObject);
            JSONArray departmentsArr = (JSONArray) jsonObject.get("departments");
            Set<Departments> departmentsResult = new LinkedHashSet<>();
            String id = "";
            String name = "";
            String img = "";
            for (int i = 0; i <= departmentsArr.size() - 1; i++) {
                JSONObject departmentsObj = (JSONObject) departmentsArr.get(i);
                id = (String) departmentsObj.get("id");
                name = (String) departmentsObj.get("name");
                img = (String) departmentsObj.get("image");
                departmentsResult.add(new Departments(id, name, img));
            }
            System.out.println("Departments Result :: "+departmentsResult);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

