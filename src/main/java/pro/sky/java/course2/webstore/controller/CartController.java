package pro.sky.java.course2.webstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webstore.data.Product;
import pro.sky.java.course2.webstore.service.CartService;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "id") ArrayList<Integer> idList) {
        cartService.addProductToCart(idList);
        return "Товары добавлены в корзину";
    }

    @GetMapping("/get")
    public Collection<Product> getAll() {
        return cartService.getCart();
    }
}
