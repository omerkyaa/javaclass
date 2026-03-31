package amazon.week2.encapsulation;

public class ShoppingItem {

    private String name;

    private int quantity;

    public ShoppingItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() > 2){
            this.name = name;
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if ((quantity > 0) && (quantity < 7)){
            this.quantity = quantity;
        }

    }

    @Override
    public String toString() {
        return "ShoppingItem with name='" + name + " and quantity=" + quantity;
    }

}
