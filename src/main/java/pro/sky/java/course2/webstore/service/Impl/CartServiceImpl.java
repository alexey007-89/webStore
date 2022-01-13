package pro.sky.java.course2.webstore.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.webstore.data.Cart;
import pro.sky.java.course2.webstore.data.Product;
import pro.sky.java.course2.webstore.service.CartService;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addProductToCart(ArrayList<Integer> idList) {
        for (Integer id : idList) {
            cart.addProduct(id);
        }
    }

    @Override
    public Collection<Product> getCart() {
        return cart.getCart();
    }
}
