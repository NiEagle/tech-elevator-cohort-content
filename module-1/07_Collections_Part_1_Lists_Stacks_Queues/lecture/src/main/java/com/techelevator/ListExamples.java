package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        //BE ABLE TO DECLARE AND INSTANTIATE ARRAYLIST
        List<Integer> testScores = new ArrayList<>();
        List<String> ninjaNames = new ArrayList<>();
        List<Boolean> truthStuff = new ArrayList<>();

        //BE ABLE TO PUT THINGS INTO OUR LIST
        testScores.add(5);
        testScores.add(10);
        testScores.add(15);

        ninjaNames.add("Cole");
        ninjaNames.add("Madeline");
        ninjaNames.add("Andy");
        ninjaNames.add("Ryan");

        ninjaNames.add(1, "Andy");


        truthStuff.add(false);
        truthStuff.add(true);

        //BE ABLE TO GET THINGS OUT
        int scoreAtIndex1 = testScores.get(1);


        //BE ABLE TO REMOVE
        ninjaNames.remove(0);
        System.out.println(ninjaNames);

        boolean isColeInMyList = ninjaNames.contains("Cole");
        if (!isColeInMyList) {
            ninjaNames.add("Cole");

        }
        //BE ABLE TO LOOP USING A FOR LOOP
        for (int i = 0; i < ninjaNames.size(); i++) {
            if (ninjaNames.get(i).equals("Ryan")) {
                System.out.println("We removed: " + ninjaNames.get(i));
                ninjaNames.remove(i);
                break;
            }
        }

        //BE ABLE TO LOOP USING AN Enhanced FOR LOOP
        for (String ninja : ninjaNames) {
            if (ninja.equals("Cole")) {
                System.out.println("We found: " + "Cole");

                break;
            }

            {
                //BE ABLE TO TAKE AN ARRAY AND TURN INTO A LIST
                double[] measurements = new double[]{2.0, 3.0, 4.4, 5.5};
                List<Double> mList = new ArrayList<>();
                for (double m : measurements) {
                    mList.add(m);
                }
                System.out.println(mList);
                break;
            }


        }
        List<Float> floaties =new ArrayList<>();
        floaties.add(1.0f);
        floaties.add(2.0f);

        float[] floatArray = new float[floaties.size()];

        for(int i = 0; i < floaties.size(); i++){
            floatArray[i] = floaties.get(i);
    }

    }

}