package pro.sky.java.course2.webstore.service;

import pro.sky.java.course2.webstore.data.Product;

import java.util.ArrayList;
import java.util.Collection;

public interface CartService {
    void addProductToCart(ArrayList<Integer> idList);

    Collection<Product> getCart();

}
