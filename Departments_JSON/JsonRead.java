package com.json.departments;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInput;
import java.io.IOException;
import java.util.*;

public class JsonRead {

    public String getStringRes(String res1, String res2) {
        JSONObject obj1 = new JSONObject(res1);
        JSONObject obj2 = new JSONObject(res2);

        try {

            if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {

                //file-1
                JSONArray arr1 = obj1.getJSONArray("departments");
                List list1 = new ArrayList();
                List<Departments> dept_1 = new ArrayList<>();
                for(int i=0; i<= arr1.length()-1; i++){
                    JSONObject jsonObj1 = arr1.getJSONObject(i);
                    list1.add(jsonObj1.getString("name"));
                    String id = (String) jsonObj1.get("id");
                    String name = (String) jsonObj1.get("name");
                    String img = (String) jsonObj1.get("image");
                    dept_1.add(new Departments(id, name, img));

                }

                //file-2
                JSONArray arr2 = obj2.getJSONArray("departments");
                List list2 = new ArrayList();
                List<Departments_2> dept_2 = new ArrayList<>();
                for(int j=0; j<= arr2.length()-1; j++){
                    JSONObject jsonObj2 = arr2.getJSONObject(j);
                    list2.add(jsonObj2.getString("name"));
                    String id = (String) jsonObj2.get("id");
                    String name = (String) jsonObj2.get("name");
                    String img = (String) jsonObj2.get("image");
                    String shortDesc = (String) jsonObj2.get("shortDesc");
                    dept_2.add(new Departments_2(id, name, shortDesc, img));

                }

                //find uncomman data in file-2
                list2.removeAll(list1);

                // display uncomman data in file-2
                for(int k = 0; k <= list2.size()-1; k++){
                    for(int dept = 0; dept <= dept_2.size()-1; dept++){
                        Departments_2 deptjson = dept_2.get(dept);
                        if(deptjson.getName().equals(list2.get(k))){
                            System.out.println("Missing Data in File-1");
                            System.out.println("ID = "+deptjson.getId());
                            System.out.println("Name = "+deptjson.getName());
                            System.out.println("Image = "+deptjson.getImg());
                            System.out.println("Short Desc = "+deptjson.getShortDesc());
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "test";
    }

}
