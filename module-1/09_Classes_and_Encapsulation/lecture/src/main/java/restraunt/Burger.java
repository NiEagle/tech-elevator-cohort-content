package restraunt;

public class Burger {



    //CLASS VARIABLES
    private String bunType;
    private String howCooked;
    private String meatType;

    //TODO - Come back later and add a list<Ingredients>
    //CONSTRUCTOR

    public Burger(String meatType){
        this.meatType = meatType;
    }
    //default CONSTRUCTOR

    //PUBLIC METHODS
    //PRIVATE METHODS


    //GETTERS AND SETTERS
    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public String getHowCooked() {
        return howCooked;
    }

    public void setHowCooked(String howCooked) {
        this.howCooked = howCooked;
    }

    public String getMeatType() {
        return meatType;
    }




}
