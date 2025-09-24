package Model.Operation;

public class Operation {
    private int operation_id;
    private int product_id;
    private Type type;
    private int quantity;
    private int user_id;

    public Operation(int product_id, Type type, int quantity, int user_id) {
        this.product_id = product_id;
        this.type = type;
        this.quantity = quantity;
        this.user_id = user_id;
    }

    public int getOperation_id() {
        return operation_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
