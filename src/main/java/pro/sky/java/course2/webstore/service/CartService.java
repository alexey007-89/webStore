package pro.sky.java.course2.webstore.service;

import pro.sky.java.course2.webstore.data.Item;

import java.util.Collection;

public interface CartService {
    void addItemToCart(String id);

    Collection<Item> getCart();

}
