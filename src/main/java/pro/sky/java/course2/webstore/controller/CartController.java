package pro.sky.java.course2.webstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webstore.data.Item;
import pro.sky.java.course2.webstore.service.CartService;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") String id) {
        cartService.addItemToCart(id);
        return "Товар id=" + id + " добавлен в корзину";
    }

    @GetMapping("/get")
    public Collection<Item> getAll() {
        return cartService.getCart();
    }
}
