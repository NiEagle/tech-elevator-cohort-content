import jdk.jshell.MethodSnippet;

public abstract class vendingProduct {
//CLASS VARIABLES
    private String slotLocation;
    private String nameOfItem;
    private int quantityInMachine;
    private double priceOfItem;
//METHODS
    public vendingProduct(String slotLocation,String nameOfItem,int quantityInMachine,double priceOfItem){
        this.slotLocation = slotLocation;
        this.nameOfItem = nameOfItem;
        this.quantityInMachine =quantityInMachine;
        this.priceOfItem = priceOfItem;
    }

//GETTERS

    public String getSlotLocation() {
        return slotLocation;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public int getQuantityInMachine() {
        return quantityInMachine;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    //SETTERS

    public void setQuantityInMachine(int quantityInMachine) {
        this.quantityInMachine = quantityInMachine;
    }

}