package aed.individual2;

import es.upm.aedlib.indexedlist.*;

public class IndexedListCheckSumUtils {

    // a no es null, podria tener tamaño 0, n>0
    public static IndexedList<Integer> indexedListCheckSum(IndexedList<Integer> list, int n) {
        IndexedList<Integer> res = new ArrayIndexedList<>();
        if (list.isEmpty())
            return res;
        int i = 0;
        for (; i < list.size(); i++) {
            if (list.size() - (i + 1) * n < 0) {
                break;
            } else {
                int acc = 0;
                for (int j = 0; j < n; j++) {
                    res.add(i * (n + 1) + j, list.get(i * n + j));
                    acc += list.get(j + i * n);
                }
                res.add(i * (n + 1) + n, acc);
            }
        }
        if (list.size() % n != 0) {
            int acc = 0;
            for (int k = 0; k < list.size() % n; k++) {
                res.add(Integer.valueOf(list.size() / n) * n + i + k,
                        list.get(Integer.valueOf(list.size() / n) * n + k));
                acc += list.get(Integer.valueOf(list.size() / n) * n + k);
            }
            res.add(Integer.valueOf(list.size() / n) * n + i + (list.size() % n), acc);
        }
        return res;
    }

    // list no es null, podria tener tamaño 0, n>0
    public static boolean checkIndexedListCheckSum(IndexedList<Integer> list, int n) {
        boolean isCorrect = (list.size() % (n + 1) == 1 || list.size() == n) ? false : true;
        if (isCorrect)
            for (int i = n; i < list.size() && isCorrect; i += (n + 1)) {
                int acc = 0;
                for (int j = i - n; j < i; j++) {
                    acc += list.get(j);
                }
                if (acc != list.get(i))
                    isCorrect = false;
            }

        return isCorrect;
    }
}
