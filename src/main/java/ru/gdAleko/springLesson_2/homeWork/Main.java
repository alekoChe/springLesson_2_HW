package ru.gdAleko.springLesson_2.homeWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        System.out.println(productService.getProduct(1l));

        Cart cart = context.getBean(Cart.class);
        System.out.println(cart.showCartList());
        cart.addProductIntoCart(4);
        System.out.println(cart.showCartList());
        cart.deleteProductFromCartList(4L);
        System.out.println(cart.showCartList());
    }
}
