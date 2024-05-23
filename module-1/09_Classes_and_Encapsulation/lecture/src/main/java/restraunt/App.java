package restraunt;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Burger> order = new ArrayList<>();

        Burger myBurger = new Burger("FREE-RANGE kangaroo");
        myBurger.setBunType("Gluten-Free");
        myBurger.setHowCooked("Well-Done");

        Burger yourBurger = new Burger("Beef");
        yourBurger.setHowCooked("Mooing");
        yourBurger.setBunType("Kaiser");
        order.add(myBurger);
        order.add(yourBurger);

        for(Burger b : order){
            System.out.println((b.getBunType()) + " " + b.getHowCooked());
        }

        Calc calculator = new Calc();
        int sum = calculator.addTwo(412411,7324241);
        System.out.println(sum);

        sum = calculator.addThree(1,2,3);
        System.out.println(sum);


    }
}
