package it.unibo.oop.lab05.ex2;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {
    
    private final static int ELEMS = 100;

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         */
         Set<String> set = new TreeSet<>(new MyStringComparable());
         /* 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         */
         for(int i=0;i<ELEMS;i++) {
             set.add(Double.toString(Math.random()));
         }
         /* 3) Prints the set, which must be ordered
         */
         System.out.println(set);
    }
}
