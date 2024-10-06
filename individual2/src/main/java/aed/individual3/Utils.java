package aed.individual3;

import java.util.Iterator;

import es.upm.aedlib.positionlist.NodePositionList;

public class Utils {
    public static boolean isArithmeticSequence(Iterable<Integer> l) {
        
        Iterator<Integer> itSize = l.iterator();
        int last = 0;// TODO
        int size = 0;
        while (itSize.hasNext()) {
            Integer temp = itSize.next();
            if(temp == null)
                continue;
            size++;
            last = temp;
        }
        if (size <= 2)
            return true;

        //int acc = size % 2 == 0 ? null : last; // sets the value of the substraction to the

        Iterator<Integer> it = l.iterator();
        Integer substraction = null;
        Integer numPrev = null;
        boolean isTrue = true;
        while (it.hasNext() && isTrue) {
            Integer numAct = it.next();
            if (null == numAct)
                continue;
            if (numPrev == null) { // primera ronda
                numPrev = numAct;
            } else {
                if (substraction == null) {
                    substraction = numAct - numPrev;
                } else {
                    int currentSubstraction = numAct - numPrev;
                    isTrue = substraction == currentSubstraction ? true : false;
                }
                numPrev = numAct;
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {
        System.out.println(isArithmeticSequence(new NodePositionList<Integer>(new Integer[] { null,-7,3,13,23 })));
    }
}
