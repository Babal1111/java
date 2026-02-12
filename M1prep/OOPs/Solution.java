public class Solution {

    public static void processInput(String input) {

        Utility utility = new Utility();
        String[] data = input.split(":");
        String id = data[0];

        if (!utility.validateTransportId(id)) {
            System.out.println("Transport id " + id + " is invalid");
            System.out.print("Please provide a valid record");
            return;
        }

        GoodsTransport goodsTransport = utility.parseDetails(input);
        String vehicle = goodsTransport.vehicleSelection();
        float totalCharge = goodsTransport.calculateTotalCharge();

        if (goodsTransport instanceof BrickTransport) {
            BrickTransport bt = (BrickTransport) goodsTransport;
            System.out.println("Transporter id : " + bt.getTransportId() +
                    " | Date of transport : " + bt.getTransportDate() +
                    " | Rating of the transport : " + bt.getTransportRating() +
                    " | Quantity of bricks : " + bt.getBrickQuantity() +
                    " | Brick price : " + bt.getBrickPrice() +
                    " | Vehicle for transport : " + vehicle +
                    " | Total charge : " + totalCharge);
        } else {
            TimberTransport tt = (TimberTransport) goodsTransport;
            System.out.println("Transporter id : " + tt.getTransportId() +
                    " | Date of transport : " + tt.getTransportDate() +
                    " | Rating of the transport : " + tt.getTransportRating() +
                    " | Type of the timber : " + tt.getTimberType() +
                    " | Timber price per kilo : " + tt.getTimberPrice() +
                    " | Vehicle for transport : " + vehicle +
                    " | Total charge : " + totalCharge);
        }
    }
}

abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(String transportDate) {
        this.transportDate = transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public void setTransportRating(int transportRating) {
        this.transportRating = transportRating;
    }

    public abstract String vehicleSelection();
    public abstract float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }

    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    public String vehicleSelection() {
        if (brickQuantity < 300)
            return "Truck";
        else if (brickQuantity <= 500)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;

        float vehiclePrice;
        String vehicle = vehicleSelection();

        if (vehicle.equals("Truck"))
            vehiclePrice = 1000f;
        else if (vehicle.equals("Lorry"))
            vehiclePrice = 1700f;
        else
            vehiclePrice = 3000f;

        float discountPercentage = 0f;

        if (transportRating == 5)
            discountPercentage = 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discountPercentage = 0.10f;

        float discount = price * discountPercentage;

        return (price + vehiclePrice + tax) - discount;
    }
}

class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float timberTypeRate = 0f;
        if (timberType.equalsIgnoreCase("Premium"))
            timberTypeRate = 0.25f;
        else
            timberTypeRate = 0.15f;

        float price = volume * timberPrice * timberTypeRate;
        float tax = price * 0.3f;

        float vehiclePrice;
        String vehicle = vehicleSelection();

        if (vehicle.equals("Truck"))
            vehiclePrice = 1000f;
        else if (vehicle.equals("Lorry"))
            vehiclePrice = 1700f;
        else
            vehiclePrice = 3000f;

        float discountPercentage = 0f;

        if (transportRating == 5)
            discountPercentage = 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discountPercentage = 0.10f;

        float discount = price * discountPercentage;

        return (price + vehiclePrice + tax) - discount;
    }
}

class Utility {

    public boolean validateTransportId(String transportId) {
        return transportId.matches("RTS\\d{3}[A-Z]");
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String id = data[0];
        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(data[4]);
            int brickQty = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(id, date, rating, brickSize, brickQty, brickPrice);
        } else {

            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(id, date, rating,
                    timberLength, timberRadius, timberType, timberPrice);
        }
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof BrickTransport)
            return "BrickTransport";
        else
            return "TimberTransport";
    }
}

