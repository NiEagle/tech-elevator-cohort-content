package com.techelevator.restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFileReader {

    private File inventoryFile = new File("inventory.txt");

    public List<Ingredient> loadFile() throws FileNotFoundException {
        List<Ingredient> listOfIngredients = new ArrayList<>();

        try(Scanner scanner = new Scanner(inventoryFile)){
            String record = scanner.nextLine();

            System.out.println(record);
    }



}
