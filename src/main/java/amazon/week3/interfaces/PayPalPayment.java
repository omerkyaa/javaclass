package amazon.week3.interfaces;

public class PayPalPayment implements Payment{
    @Override
    public void charge(double amount) {

        System.out.println("We charge now via Paypal. ");


    }

    @Override
    public PaymentStatus getStatus() {
        return PaymentStatus.CANCELED;
    }





}
