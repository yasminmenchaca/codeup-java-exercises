package groceries;

public class Groceries {

    private String ItemName;
    private double ItemPrice;
    private int ItemQty;

//    public Groceries() {
//        ItemName = "Fruit";
//        ItemPrice = 100;
//        ItemQty = 1;
//
//    }

    public Groceries(String ItemName, double ItemPrice, int ItemQty) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemQty = ItemQty;

    }

    public String getItemName() {
        return ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public double getItemTotalPrice() {
        return ItemPrice * ItemQty;
    }

    public int getItemQty() {
        return ItemQty;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public void setItemQty(int ItemQty) {
        this.ItemQty = ItemQty;
    }

    public String toString() {
        String state = ItemName + " -  $" + ItemPrice + " x " + ItemQty;
        return state;
    }
}