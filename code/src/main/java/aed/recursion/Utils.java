package aed.recursion;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;

public class Utils {

    public static int sqrt(int n) {
        return sqrtRes(n,n/Math.E);
    }
    
    //* Truncated sqrt recursive function. First attempt, Babylonian method */
    private static int sqrtRes(int a, double xn){
        if((int)xn*(int)xn<=a&&a<=((int)xn+1)*((int)xn+1)) // Final case
            return (int)xn;
        else{ // General case
            return sqrtRes(a, (xn+a/xn)/2);
        }
    }

    public static Iterable<Integer> primes(int n) {
        PositionList<Integer> crib = new NodePositionList<Integer>(advancedCribGen(n, new Integer[n%2==0?n/2:(n+1)/2]));
        return primesRes();
    }

    private static Iterable<Integer> primesRes(){
        return null;
    }

    private static Integer[] advancedCribGen(int n, Integer[] crib){
        crib[0]=2;
        crib[1]=3;
        return advancedCribGenRes(n,crib,2);
    }

    private static Integer[] advancedCribGenRes(int n, Integer[] crib, int iter){
        if(crib[iter-1]-n>-2)
            return crib;
        crib[iter] = crib[iter-1]+2;
        return advancedCribGenRes(n, crib, iter+1);
    }

    public static <E> boolean equals(PositionList<Pair<E, Integer>> p1, PositionList<Pair<E, Integer>> p2) {
        return false;
    }
    public static void main(String[] args) {
        int n= 63;
        System.out.println(advancedCribGen(n, new Integer[n%2==0?n/2:(n+1)/2]));
    }

}