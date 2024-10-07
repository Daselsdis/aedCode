package aed.individual3;

import java.util.Iterator;

public class Utils {
    public static boolean isArithmeticSequence(Iterable<Integer> l) {
        // This is a size optimization, when an iterator is filled with filler nulls and
        // or only has 2 or less significant Integers, this is a really small
        // improvement, but in my computer, the average execution time was reduced
        // slightly.
        Iterator<Integer> itSize = l.iterator();
        int size = 0;
        while (itSize.hasNext()&&size<3) { // Past 3 we don't care about size
            Integer temp = itSize.next();
            if (temp == null)
                continue;
            size++;
        }
        if (size <= 2)
            return true;

        // Main processing, opne by one we check for the appropiate state of the checker
        // variables and in time, check for the conditions asked.
        Iterator<Integer> it = l.iterator();
        Integer difference = null;
        Integer numPrev = null;
        boolean isTrue = true;
        while (it.hasNext() && isTrue) {
            Integer numAct = it.next();
            if (null == numAct) // we skip nulls
                continue;
            if (numPrev == null) { // primera ronda
                numPrev = numAct;
            } else {
                if (difference == null) { // first substraction
                    difference = numAct - numPrev;
                } else { // consequent substrations, comparison, we stop early via isTrue as soon as we
                         // detect the condition has been failed
                    isTrue = difference == numAct - numPrev ? true : false;
                }
                numPrev = numAct; // either way, we go next
            }
        }
        return isTrue;
    }
}
