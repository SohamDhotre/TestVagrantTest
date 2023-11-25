import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductGSTCalculation {

    public static void main(String[] args) {
        // Creating a list of products
        List<Product> list = new ArrayList<>();
        list.add(new Product("Leather wallet", 1100, 18, 1));
        list.add(new Product("Umbrella", 900, 12, 4));
        list.add(new Product("Cigarett", 200, 28, 3));
        list.add(new Product("Honey", 100, 0, 2));

        
        Map<String, Double> gstAmountPerProduct = new HashMap<>();
        for (Product product : list) {
            double gstAmount = (product.getPrice() * product.getPercentage() * product.getQuantity()) / 100;
            gstAmountPerProduct.put(product.getProductName(), gstAmount);
        }

        
        String productWithMaxGST = gstAmountPerProduct.entrySet().stream()
                .max((entry1, entry2) -> Double.compare(entry1.getValue(), entry2.getValue()))
                .get().getKey();

        
        double discount = 0;
        for (Product product : list) {
            if (product.getPrice() >= 500) {
                discount += (product.getPrice() * 5 * product.getQuantity()) / 100;
            }
        }

        
        double totalAmount = 0;
        for (Product product : list) {
            totalAmount += (product.getPrice() * product.getQuantity());
        }

        // Applying discount
        totalAmount -= discount;

        System.out.println("Product with maximum GST amount: " + productWithMaxGST);
        System.out.println("Total amount to be paid: " + totalAmount);
    }
}