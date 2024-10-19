package aed.individual1;

public class ArrayCheckSumUtils {

    // a no es null, podria tener tamaño 0, n>0
    public static int[] arrayCheckSum(int[] arr, int n) {
        int vueltasEnteras = Integer.valueOf(arr.length / n);
        int resto = arr.length % n;
        int[] res = new int[arr.length + vueltasEnteras + ((resto != 0) ? 1 : 0)];
        if (arr.length == 0)
            return res;
        for (int i = 0; i < vueltasEnteras; i++) {
            int acc = 0;
            for (int j = 0; j < n; j++) {
                res[i * (n + 1) + j] = arr[i * n + j];
                acc += arr[i * n + j];
            }
            res[i * (n + 1) + n] = acc;
        }
        if (resto != 0) {
            int acc = 0;
            for (int i = 0; i < resto; i++) {
                res[vueltasEnteras * (n + 1) + i] = arr[vueltasEnteras * n + i];
                acc += arr[vueltasEnteras * n + i];

            }
            res[(vueltasEnteras) * (n + 1) + resto] = acc;
        }

        return res;
    }
}
