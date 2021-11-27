package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> p = new LinkedHashSet<>(setA);
        p.addAll(setB);
        return p;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> p = new LinkedHashSet<>();
        for(X it: setA) {
            if(setB.contains(it)) {
                p.add(it);
            }
        }
        return p;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> p = new LinkedHashSet<>(setA);
        p.addAll(setB);
        p.removeAll(setIntersection(setA,setB));
        return p;
        
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        Random rnd = new Random();
        int i = rnd.nextInt(coll.size());
        int y=0;
        for(final X x: coll) {
            if(y==i) {
                return x;
            }
            y++;
        }
        return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        return new Pair<>(getRandomElement(first),getRandomElement(second));
    }
}
