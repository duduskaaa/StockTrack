package Model.Product;

public class Product {
    private int product_id;
    private String product_name;
    private Category category;
    private int amount;

    public Product(String product_name, Category category, int amount) {
        this.product_name = product_name;
        this.category = category;
        this.amount = amount;
    }


    public String getProduct_name() {
        return product_name;
    }

    public void setName(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category.name();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
