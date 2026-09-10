public class PolymorphismDemo {
    static class Payment {
        void makePayment(double amount) {
            System.out.println("Processing payment of Rs." + amount);
        }
    }
    static class CreditCardPayment extends Payment {
        @Override
        void makePayment(double amount) {
            System.out.println(
                "Rs." + amount + " paid using Credit Card"
            );
        }
    }
    static class UPIPayment extends Payment {
        @Override
        void makePayment(double amount) {
            System.out.println(
                "Rs." + amount + " paid using UPI"
            );
        }
    }
    static class NetBankingPayment extends Payment {
        @Override
        void makePayment(double amount) {
            System.out.println(
                "Rs." + amount + " paid using Net Banking"
            );
        }
    }
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.makePayment(5000);
        p = new UPIPayment();
        p.makePayment(2500);
        p = new NetBankingPayment();
        p.makePayment(10000);
    }
}



