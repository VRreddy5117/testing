package com.json.productdetails;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class JsonFileRead {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\rannem\\IdeaProjects\\Selenium\\src\\test\\java\\com\\json\\productdetails\\productdetails.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("JSON Response :: " + jsonObject);

            JSONObject productDetails = (JSONObject) jsonObject.get("productDetail");
            Set<ProductDetails> productInfo = new LinkedHashSet<>();
                String id = (String) productDetails.get("id");
                long price = (Long) productDetails.get("price");
                long basePrice = (Long) productDetails.get("basePrice");
                String promoEndDate = (String) productDetails.get("promoEndDate");
                long pricePer = (Long) productDetails.get("pricePer");
                String sellByWeight = (String) productDetails.get("sellByWeight");
                String averageWeight = (String) productDetails.get("averageWeight");
                String maxWeight = (String) productDetails.get("maxWeight");
                String upc = (String) productDetails.get("upc");
                boolean edited = (boolean) productDetails.get("edited");
                long versionid = (long) productDetails.get("versionid");
                String lineadded = (String) productDetails.get("lineadded");
                String aisleId = (String) productDetails.get("aisleId");
                String name = (String) productDetails.get("name");
                String image = (String) productDetails.get("image");
            long estimatedDiscount = (long) productDetails.get("estimatedDiscount");
                String departmentName = (String) productDetails.get("departmentName");
                String aisleName = (String) productDetails.get("aisleName");
                String shelfName = (String) productDetails.get("shelfName");
                String promoDescription = (String) productDetails.get("promoDescription");
                String promoType = (String) productDetails.get("promoType");
                String promoText = (String) productDetails.get("promoText");
            long triggerQuantity = (long) productDetails.get("triggerQuantity");
                String comment = (String) productDetails.get("comment");
                String substitutionValue = (String) productDetails.get("substitutionValue");
                String inlinePromoId = (String) productDetails.get("inlinePromoId");
                String inlinePromoImage = (String) productDetails.get("inlinePromoImage");
            long quantity = (long) productDetails.get("quantity");
            long displayType = (long) productDetails.get("displayType");
                String unitOfMeasure = (String) productDetails.get("unitOfMeasure");
            long restrictedValue = (long) productDetails.get("restrictedValue");
            long salesRank = (long) productDetails.get("salesRank");
            long width = (long) productDetails.get("width");
            long depth = (long) productDetails.get("depth");
            long height = (long) productDetails.get("height");
                String zonecode = (String) productDetails.get("zonecode");
                String prop65WarningTypeCD = (String) productDetails.get("prop65WarningTypeCD");
                String prop65WarningText = (String) productDetails.get("prop65WarningText");
                boolean prop65WarningIconRequired = (boolean) productDetails.get("prop65WarningIconRequired");
                String productDetailsUrl = (String) productDetails.get("productDetailsUrl");
                String similarItemsUrl = (String) productDetails.get("similarItemsUrl");


            productInfo.add(new ProductDetails(id, price, basePrice, promoEndDate, pricePer, sellByWeight, averageWeight, maxWeight, upc, edited,
                        versionid, lineadded, aisleId, name, image, estimatedDiscount, departmentName, aisleName, shelfName, promoDescription,
                        promoType, promoText, triggerQuantity, comment, substitutionValue, inlinePromoId, inlinePromoImage, quantity, displayType,
                        unitOfMeasure, restrictedValue, salesRank, width, depth, height, zonecode, prop65WarningTypeCD, prop65WarningText,
                        prop65WarningIconRequired, productDetailsUrl, similarItemsUrl ));

            System.out.println("ProductDetails :: "+ productInfo);



            //Details Array
            JSONArray detailsArr = (JSONArray) productDetails.get("details");
            Set<DetailsArr> details = new LinkedHashSet<>();
            for (int i = 0; i <= detailsArr.size() - 1; i++) {
                JSONObject record = (JSONObject) detailsArr.get(i);
                String header = (String) record.get("header");
                String value = (String) record.get("value");
                details.add(new DetailsArr(header, value));
            }
            System.out.println("Details :: "+details);

            // nutritionFacts Array
            JSONArray nutritionFactsArr = (JSONArray) productDetails.get("nutritionFacts");
            Set<NutritionFacts> nutritionFacts = new LinkedHashSet<>();
            for(int i = 0; i <= nutritionFactsArr.size()-1; i++){
                String nutId = "";
                String value = "";
                boolean offset = false;
                int colSpan = 0;
                String align = "";
                boolean isLine = false;
                int lineHeight = 0;
                boolean isLineBlack = false;
                JSONArray recordArr = (JSONArray) nutritionFactsArr.get(i);

                for(int j = 0; j <= recordArr.size()-1; j++){
                    JSONObject record = (JSONObject) recordArr.get(j);
                    nutId = (String) record.get("id");
                    value = (String) record.get("value");
                    offset = (boolean) record.get("offset");
                    colSpan =  ((Long)record.get("colSpan")).intValue();
                    align = (String) record.get("align");
                    isLine = (boolean) record.get("isLine");
                    lineHeight = ((Long) record.get("lineHeight")).intValue();
                    isLineBlack = (boolean) record.get("isLineBlack");

                    nutritionFacts.add(new NutritionFacts(nutId, value, offset, colSpan, align, isLine, lineHeight, isLineBlack));

                }
            }
            System.out.println("NutritionFacts :: "+nutritionFacts);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
