public class CoffeeShop {
    public static void main(String[] args) {
        String coffeeSize = "medium"; // Customer's choice of coffee size
        int price;

        switch (coffeeSize) {
            case "small":
                price = 50; // Price for small size
                break;
            case "medium":
                price = 70; // Price for medium size
                break;
            case "large":
                price = 90; // Price for large size
                break;
            default:
                price = 0; // Default case if no size matches
                System.out.println("Invalid size selected.");
        }

        if (price != 0) {
            System.out.println("Total bill for " + coffeeSize + " coffee: Rs. " + price);
        }
    }
}