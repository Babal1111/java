package ExceptionHandeling;


class NetworkFailureException extends RuntimeException {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class PaymentGateway {

    int failureCount = 0;
    int maxRetries = 3;

    public void processPayment() {
        failureCount++;
        System.out.println("Attempt " + failureCount + ": Processing payment...");

        if (failureCount < 3) {
            throw new NetworkFailureException("Network error occurred.");
        }

        System.out.println("Payment processed successfully!\n");
    }
}

class PaymentService {

    double amount;
    boolean paymentSuccessful = false;

    public PaymentService(double amount) {
        this.amount = amount;
    }

    public void makePayment(PaymentGateway gateway) {

        while (!paymentSuccessful && gateway.failureCount < gateway.maxRetries) {

            try {
                gateway.processPayment();
                paymentSuccessful = true;
            } catch (NetworkFailureException e) {
                System.out.println(e.getMessage() + " Retrying...\n");
                if (gateway.failureCount == gateway.maxRetries) {
                    throw e;
                }
            }
        }

        if (paymentSuccessful) {
            System.out.println("Final Status: PAYMENT SUCCESSFUL");
        } else {
            System.out.println("Final Status: PAYMENT FAILED");
        }
    }
}

public class Driver {

    public static void main(String[] args) {

        PaymentGateway gateway = new PaymentGateway();
        PaymentService service = new PaymentService(2500);

        try {
            service.makePayment(gateway);
        } catch (NetworkFailureException e) {
            System.out.println("Final Status: PAYMENT FAILED");
        }
    }
}
