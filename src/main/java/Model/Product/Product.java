package Model;

public class Product {
    private int productid;
    private String name;
    private Category category;
    private int amount;

    public Product(String name, Category category, int amount) {
        this.name = name;
        this.category = category;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
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
