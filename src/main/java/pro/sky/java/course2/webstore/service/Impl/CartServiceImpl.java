package pro.sky.java.course2.webstore.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.webstore.data.Item;
import pro.sky.java.course2.webstore.service.CartService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService {
    private final List<Item> items;

    public CartServiceImpl() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItemToCart(String ids) {
        String[] arr = ids.split("_");
        for (String str : arr) {
            int id = Integer.parseInt(str);
            Item newItem = new Item(id);
            items.add(newItem);
        }
    }

    @Override
    public Collection<Item> getCart() {
        return items;
    }
}
