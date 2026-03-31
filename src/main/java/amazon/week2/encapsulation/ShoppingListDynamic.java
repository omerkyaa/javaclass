package amazon.week2.encapsulation;

import java.util.ArrayList;

public class ShoppingListDynamic {

    private ArrayList<ShoppingItem> myList;

    public ShoppingListDynamic(ArrayList<ShoppingItem> myList) {
        this.myList = myList;  //constructor
    }

    static void main(String[] args) {
        ShoppingListDynamic myShoppingList =
                new ShoppingListDynamic(new ArrayList<ShoppingItem>());

        ShoppingItem milk = new ShoppingItem("Milk", 2);
        myShoppingList.myList.add(milk);
        milk.setQuantity(4); // böyle degeri degistiririz

        ShoppingItem chocolate = new ShoppingItem("Chocolate", 5);
        myShoppingList.myList.add(chocolate);

        ShoppingItem water = new ShoppingItem("Water", 1);
        myShoppingList.myList.add(water);

        myShoppingList.myList.removeLast();
        //or we can write remove(index number)

        myShoppingList.myList.forEach(System.out::println);

        /*
        for (int i = 0; i < myShoppingList.myList.size(); i++){

            ShoppingItem shoppingItem = myShoppingList.myList.get(i);
            System.out.println(shoppingItem);
        }
        */




    }






}
