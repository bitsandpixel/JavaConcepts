package advancedjava.java8features.Streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Vishnu Kandanelly
 */
public class StreamFilterCollectionDemo {

    public static void main(String[] args) {

        List<Product> productsList = new LinkedList<>();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<Float>();

        for (Product product : productsList) {
            if (product.price < 30000) {
                productPriceList.add(product.price);
            }
        }

        System.out.println(productPriceList);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product {
    int id;
    String name;
    float price;
}


