package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{
    
    private Set<Product> p = new LinkedHashSet<>();

    @Override
    public void addProduct(Product p) {
        // TODO Auto-generated method stub
        this.p.add(p);
    }

    @Override
    public Set<String> allNames() {
        // TODO Auto-generated method stub
        Set<String> pName = new HashSet<>();
        for(Product prd: p) {
            pName.add(prd.getName());
        }
        return pName;
    }

    @Override
    public Set<Product> allProducts() {
        // TODO Auto-generated method stub
        return p;
    }

    @Override
    public boolean containsProduct(Product p) {
        // TODO Auto-generated method stub
        return this.p.contains(p);
    }

    @Override
    public double getQuantity(String name) {
        // TODO Auto-generated method stub
        for(Product pQ: p) {
            if(pQ.getName() == name) {
                return pQ.getQuantity();
            }
        }
        return 0;
    }

}
