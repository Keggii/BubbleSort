public class SortMeMommy {
    public static int[] sort (int[] sortThingy) {
        boolean notSorted = true;
        while(notSorted) {
            int[] past = sortThingy;

            for (int i = 0; i < sortThingy.length - 2; i++) {
                if(sortThingy[i] > sortThingy[i + 1]) {
                    int number = sortThingy[i];
                    sortThingy[i] = sortThingy[i +1];
                    sortThingy[i + 1] = number;
                }
            }
            notSorted = CompareMeDaddy.comparison(sortThingy, past);
        }
        return sortThingy;
    }
}
