
import java.util.*;

class Payment {
    private int id;
    private double amount;
    private String method;
    private String status;
    private String createdAt;

    public Payment(int id, double amount, String method, String status, String createdAt) {
        this.id = id;
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.createdAt = createdAt;
    }

    public void displayPaymentInfo() {
        System.out.println("Payment ID: " + id);
        System.out.println("Amount: " + String.format("%.2f", amount));
        System.out.println("Method: " + method);
        System.out.println("Status: " + status);
        System.out.println("Created Date: " + createdAt);
    }
}

class OrderItem {
    private int id;
    private String foodName;
    private int quantity;
    private double unitPrice;
    private double lineTotal;

    public OrderItem(int id, String foodName, int quantity, double unitPrice, double lineTotal) {
        this.id = id;
        this.foodName = foodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.lineTotal = lineTotal;
    }

    public void displayOrderItem() {
        System.out.println(id + ". Food: " + foodName + " | Quantity: " + quantity + " | Unit Price: " 
                           + String.format("%.2f", unitPrice) + " | Line Total: " + String.format("%.2f", lineTotal));
    }
}

class Order {
    private int id;
    private String customerName;
    private double totalAmount;
    private List<OrderItem> orderItems;
    private Payment payment;

    public Order(int id, String customerName, double totalAmount, List<OrderItem> orderItems, Payment payment) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
        this.payment = payment;
    }

    public void displayOrderInfo() {
        System.out.println("\nOrder ID: " + id);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + String.format("%.2f", totalAmount));
        System.out.println("\nOrder Items:");
        for (OrderItem item : orderItems) {
            item.displayOrderItem();
        }
        System.out.println();
        payment.displayPaymentInfo();
    }
}

class User {
    private int userId;
    private String fullName;
    private String email;
    private List<Order> orders;

    public User(int userId, String fullName, String email, List<Order> orders) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.orders = orders;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        for (Order order : orders) {
            order.displayOrderInfo();
        }
    }
}

public class OrderImp {
    public static void main(String[] args) {
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(new OrderItem(1, "Pizza", 2, 200.00, 400.00));
        orderItems1.add(new OrderItem(2, "Pasta", 1, 150.00, 150.00));
        Payment payment1 = new Payment(301, 550.00, "CARD", "SUCCESS", "2025-10-23");
        Order order1 = new Order(201, "Emma Brown", 950.75, orderItems1, payment1);

        // Example: another order with different items
        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(new OrderItem(1, "Burger", 3, 100.00, 300.00));
        orderItems2.add(new OrderItem(2, "Fries", 2, 50.00, 100.00));
        Payment payment2 = new Payment(302, 400.00, "UPI", "SUCCESS", "2025-10-24");
        Order order2 = new Order(202, "Emma Brown", 400.00, orderItems2, payment2);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        User user = new User(101, "Emma Brown", "emma.brown@email.com", orders);
        user.displayUserInfo();
    }
}
