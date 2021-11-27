package it.unibo.oop.lab05.ex4;

import java.util.Comparator;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparator<Product>{

    public ComparableProduct(String name, int quantity) {
        super(name, quantity);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compare(Product o1, Product o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }

}
