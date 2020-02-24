package POC_Constructive;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\rannem\\Downloads\\data.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray companyList = (JSONArray) jsonObject.get("departments");
            System.out.println(companyList);
            Iterator<JSONObject> iterator = companyList.iterator();

            JSONObject json = new JSONObject();
            List list = new ArrayList();
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
            json.put("",list);
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

