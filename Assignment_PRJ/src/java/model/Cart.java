
package model;

public class Cart {
    Product product;
    int quantity_cart;

    public Cart() {
    }

    public Cart(Product product, int quantity_cart) {
        this.product = product;
        this.quantity_cart = quantity_cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity_cart() {
        return quantity_cart;
    }

    public void setQuantity_cart(int quantity_cart) {
        this.quantity_cart = quantity_cart;
    }

    @Override
    public String toString() {
        return "Cart{" + "product=" + product + ", quantity_cart=" + quantity_cart + '}';
    }
    
    
    
}
