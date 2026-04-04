package amazon.week3.interfaces;

import java.util.ArrayList;

public class Order {


    ArrayList<String> myItem = new ArrayList<>();
    double total;
    Payment payment;
    //interface olunca böyle kullaniriz.
    //Tek yazimda tüm ödeme sekillerini tek yerden aliriz


    static void main(String[] args) {

        Order tubaOrder = new Order();
        tubaOrder.payment = new CreditCardPayment();
        tubaOrder.myItem.add("Jeans");
        tubaOrder.myItem.add("T-Shirt");
        tubaOrder.total = 90;
        System.out.println("Lets call the Payment method from Tuba. ");
        tubaOrder.payment.charge(90);
        if(tubaOrder.payment.getStatus() == PaymentStatus.SUCCESSFUL) {
            System.out.println("You will receive your goods very soon.");
        }
        else {
            System.out.println("your payment didnt work. Please find another method to day, we cannot ship your order. ");
        }


        Order nataliaOrder = new Order();
        nataliaOrder.payment = new PayPalPayment();
        nataliaOrder.myItem.add("Hat");
        nataliaOrder.myItem.add("Glasses");
        nataliaOrder.total = 45;
        System.out.println("Lets call the Payment method from Natalia. ");
        nataliaOrder.payment.charge(45);
        if(nataliaOrder.payment.getStatus() == PaymentStatus.SUCCESSFUL) {
            System.out.println("You will receive your goods very soon.");
        }
        else {
            System.out.println("Your payment didnt work. Please find another method to day, we cannot ship your order. ");
        }








    }










}



