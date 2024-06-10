public class gums extends vendingProduct{


    public gums(String slotLocation, String nameOfItem, int quantityInMachine, double priceOfItem) {
        super(slotLocation, nameOfItem, quantityInMachine, priceOfItem);
    }


    public int getQuantityInMachine() {
        return super.getQuantityInMachine();
    }

    public double getPriceOfItem() {
        return super.getPriceOfItem();
    }
}
