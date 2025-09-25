package Service.UI;

import Model.Product.Product;
import Service.DB.DAO.ProductDAO;

public class Track {
    static void userTrack() {
        boolean run = true;
        while (run) {
            System.out.println("""
                    1. Buy the product.
                    2. Check operations.
                    """);

            byte choice = UserInterface.scanner.nextByte();
            switch (choice) {
                case 1 -> { buyProduct(); run=false; }
            }
        }
    }

    static void buyProduct() {
        System.out.println("Product name: ");
        String product_name = UserInterface.scanner.nextLine();

        System.out.println("How many?");
        int amount = UserInterface.scanner.nextInt();

        new ProductDAO().create(new Product(product_name, null, amount));
    }
}
