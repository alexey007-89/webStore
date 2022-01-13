package pro.sky.java.course2.webstore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.webstore.data.Cart;

@Configuration
public class ConfigurationClass {

    @Bean
    @SessionScope
    public Cart createCart() {
        return new Cart();
    }
}
