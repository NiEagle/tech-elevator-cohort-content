package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        //BE ABLE TO DECLARE AND INSTANTIATE A MAP
        Map<String,Integer> homes = new HashMap<>();
        Map<String, String> stringMap = new HashMap<>();
        Map<Integer, String> numsAsStrings = new HashMap<>();

        //BE ABLE TO PUT THINGS INTO A MAP
        homes.put("43012", 17);
        homes.put("43019", 4);
        homes.put("54321", 17);

        //BE ABLE TO GET THINGS OUT OF A MAP
        //Want to get 17 out
        int homesForSaleIn43012 = homes.get("43012");
        System.out.println("There are " + homesForSaleIn43012 + " at zip: 43012");

        //PRINT OUT MAP
        System.out.println(homes);

//        int homesForSalIn43088 = homes.get("43088");
//        System.out.println(homesForSalIn43088);
        // --> null pointer error

        Integer homesForSalIn43088 = homes.get("43088");
        // RETURNS NULL
        if(homesForSalIn43088 != null){
        System.out.println(homesForSalIn43088);
        }
        else{
            System.out.println("Home not found");
        }
        //SEE IF A MAP CONTAINS A KEY
        if(homes.containsKey("43019")){
            System.out.println("We found 43019");
        }

        if(homes.isEmpty()){
        }
        else {

        }

        //BE ABLE TO LOOP THROUGH A MAP USING A SET
        Set<String> keys = homes.keySet(); //RETURNS SET OF KEYS
        for(String key: keys){
            System.out.println("Key is: " + key + " has a value of " + homes.get(key));
        }
        // GRABS WHOLE ENTRY OF MAP KEY AND VALUE
        for(Map.Entry<String, Integer> entry : homes.entrySet()){
            System.out.println("Key is: " + entry.getKey() + " has a value of " + entry.getValue());
        }

    }
}
