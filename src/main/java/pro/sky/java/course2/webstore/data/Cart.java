package pro.sky.java.course2.webstore.data;

import java.util.ArrayList;
import java.util.Objects;

public class Cart {
    private final ArrayList<Product> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addProduct(int id) {
        Product newProduct = new Product(id);
        cart.add(newProduct);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart1 = (Cart) o;
        return Objects.equals(cart, cart1.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }
}
