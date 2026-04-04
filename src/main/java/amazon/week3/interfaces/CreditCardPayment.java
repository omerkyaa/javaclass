package amazon.week3.interfaces;

public class CreditCardPayment implements Payment {


    // official contract methods used by others

    @Override
    public void charge(double amount) {

        System.out.println("We are now charging from your card. ");

    }

    @Override
    public PaymentStatus getStatus() {
        return PaymentStatus.SUCCESSFUL;
    }




}
