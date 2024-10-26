package aed.recursion;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


import es.upm.aedlib.indexedlist.*;;

public class Utils {

    public static int sqrt(int n) {
        // Math.pow(2, (1/2)*(Math.log(n)/Math.log(2))) is the optimal stating
        // aproximation for general values, though, in this small usecase, n/2 is faster
        // to calculate and good enough (these are small testing values)
        return sqrtRec(n, n / 2);
    }

    /** Truncated sqrt recursive function. First attempt, Babylonian method */
    private static int sqrtRec(int a, double xn) {
        if ((int) xn * (int) xn <= a && a <= ((int) xn + 1) * ((int) xn + 1)) // Final case
            return (int) xn;
        else { // General case
            return sqrtRec(a, (xn + a / xn) / 2);
        }
    }

    public static Iterable<Integer> primes(int n) {
        PositionList<Integer> crib = new NodePositionList<Integer>(
                advancedCribGen(n, new Integer[n % 2 == 0 ? n / 2 : (n + 1) / 2]));
        return primesRec(crib.next(crib.first()), crib); // skip 2 as we purged pairs.
    }

    private static Iterable<Integer> primesRec(Position<Integer> cursor, PositionList<Integer> grid) {
        if (Math.pow(cursor.element(), 2) > grid.last().element())
            return grid;
        cleanProd(cursor, grid);
        return primesRec(grid.next(cursor), grid);
    }

    private static void cleanProd(Position<Integer> cursor, PositionList<Integer> grid) {
        cleanProdRec(cursor.element(), grid, 2);
    }

    private static void cleanProdRec(Integer a, PositionList<Integer> grid, int iter) {
        if (!(a * iter > grid.last().element())) {
            Position<Integer> elim = find(grid, a * iter);
            if (elim != null)
                grid.remove(elim);
            cleanProdRec(a, grid, iter + 1);
        }
    }

    private static Position<Integer> find(PositionList<Integer> grid, int val) {
        // FIXME: naïve implementation, prob will swap with bin search at some point if
        // grid can be something other than a PositionList.
        return findRec(grid.first(), grid, val);
    }

    private static Position<Integer> findRec(Position<Integer> pos, PositionList<Integer> grid, int val) {
        if (pos.element() == val)
            return pos;
        if (pos.element() > val)
            return null;
        return findRec(grid.next(pos), grid, val);
    }

    private static Integer[] advancedCribGen(int n, Integer[] crib) {
        crib[0] = 2;
        crib[1] = 3;
        return advancedCribGenRes(n, crib, 2);
    }

    private static Integer[] advancedCribGenRes(int n, Integer[] crib, int iter) {
        if (crib[iter - 1] - n > -2)
            return crib;
        crib[iter] = crib[iter - 1] + 2;
        return advancedCribGenRes(n, crib, iter + 1);
    }

    public static <E> boolean equals(PositionList<Pair<E, Integer>> p1, PositionList<Pair<E, Integer>> p2) {
        if (p1.isEmpty() && p2.isEmpty())
            return true;
        if ((p1.isEmpty() && !p2.isEmpty()) || (!p1.isEmpty() && p2.isEmpty()) || (p1.size() != p2.size()))
            return false;
        return equalsIzq(p1.first(), p1, p2);
    }

    private static <E> boolean equalsIzq(Position<Pair<E, Integer>> pos1, PositionList<Pair<E, Integer>> p1,
            PositionList<Pair<E, Integer>> p2) {
        if (p1.size() != 1) {
            if (p1.next(pos1) == null)
                return true;
            return equalsDer(pos1, p2.first(), p1, p2);
        } else
            return pos1.element().equals(p2.first().element());
    }

    private static <E> boolean equalsDer(Position<Pair<E, Integer>> pos1, Position<Pair<E, Integer>> pos2,
            PositionList<Pair<E, Integer>> p1, PositionList<Pair<E, Integer>> p2) {
        if (p2.next(pos2) == null)
            // return equalsIzq(p1.next(pos1), p1, p2);
            return false;
        if (pos1.element().equals(pos2.element()))
            return true;
        return equalsDer(pos1, p2.next(pos2), p1, p2);
    }
}