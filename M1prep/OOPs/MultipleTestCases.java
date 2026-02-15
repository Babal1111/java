
import java.util.*;

class Invoice {
    private int id;
    private String invoiceNumber;
    private String pdfUrl;
    private String generatedAt;

    public Invoice(int id, String invoiceNumber, String pdfUrl, String generatedAt) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.pdfUrl = pdfUrl;
        this.generatedAt = generatedAt;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getInvoiceNumber() { return invoiceNumber; }
    public void setInvoiceNumber(String invoiceNumber) { this.invoiceNumber = invoiceNumber; }
    public String getPdfUrl() { return pdfUrl; }
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }
    public String getGeneratedAt() { return generatedAt; }
    public void setGeneratedAt(String generatedAt) { this.generatedAt = generatedAt; }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("PDF URL: " + pdfUrl);
        System.out.println("Generated Date: " + generatedAt);
    }
}

class Order {
    private int id;
    private String customerName;
    private double totalAmount;
    private Invoice invoice;

    public Order(int id, String customerName, double totalAmount, Invoice invoice) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.invoice = invoice;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public Invoice getInvoice() { return invoice; }
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    public void displayOrderInfo() {
        System.out.println("\nOrder ID: " + id);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println();
        invoice.displayInvoice();
    }
}

class User {
    private int userId;
    private String fullName;
    private String email;
    private List<Order> orders;

    public User(int userId, String fullName, String email) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }

    public void displayUserInfo() {
        System.out.println("\nUser ID: " + userId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        for(Order order : orders) {
            order.displayOrderInfo();
        }
    }
}

public class MultipleTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int numberOfUsers = sc.nextInt();
        sc.nextLine();

        List<User> users = new ArrayList<>();

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter User ID:");
            int userId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Full Name:");
            String fullName = sc.nextLine();

            System.out.println("Enter Email:");
            String email = sc.nextLine();

            User user = new User(userId, fullName, email);

            System.out.println("Enter number of orders for this user:");
            int ordersCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < ordersCount; j++) {
                System.out.println("Enter Order ID:");
                int orderId = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Customer Name:");
                String customerName = sc.nextLine();

                System.out.println("Enter Total Amount:");
                double totalAmount = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter Invoice ID:");
                int invoiceId = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Invoice Number:");
                String invoiceNumber = sc.nextLine();

                System.out.println("Enter PDF URL:");
                String pdfUrl = sc.nextLine();

                System.out.println("Enter Generated Date:");
                String generatedAt = sc.nextLine();

                Invoice invoice = new Invoice(invoiceId, invoiceNumber, pdfUrl, generatedAt);
                Order order = new Order(orderId, customerName, totalAmount, invoice);
                user.getOrders().add(order);
            }

            users.add(user);
        }

        // Display all users and their orders/invoices
        for(User user : users) {
            user.displayUserInfo();
            System.out.println("------------------------------------------------");
        }

        sc.close();
    }
}
