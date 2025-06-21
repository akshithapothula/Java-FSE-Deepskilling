package search;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product findByNameLinear(Product[] productList, String searchTerm) {
        for (Product item : productList) {
            if (item.getName().equalsIgnoreCase(searchTerm)) {
                return item;
            }
        }
        return null;
    }

    public static Product findByNameBinary(Product[] productList, String searchTerm) {
        int start = 0;
        int end = productList.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            int comparison = productList[middle].getName().compareToIgnoreCase(searchTerm);

            if (comparison == 0) {
                return productList[middle];
            } else if (comparison < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return null;
    }

    public static void sortProductsByName(Product[] productList) {
        Arrays.sort(productList, Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER));
    }
}
