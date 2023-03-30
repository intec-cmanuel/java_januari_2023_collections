package be.intecbrussel.ordersystem;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class ProductApp {
    public static void main(String[] args) {
        Queue<Product> products = new LinkedList<>();

        Product p1 = new Product("Hair dryer", 30.99);
        Product p2 = new Product("Plane", 30000000.99);
        Product p3 = new Product("Bobby pin", 0.10);
        Product p4 = new Product("Jeans", 150.00);
        Product p5 = new Product("Mansion", 5750000000.0);

        products.offer(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        Product qP1 = products.peek();
        Product qP2 = products.poll();
        Product qP3 = products.remove();
        Product qP4 = products.element();

        System.out.println(qP1);
        System.out.println(qP2);
        System.out.println(qP3);
        System.out.println(qP4);

    }
}
