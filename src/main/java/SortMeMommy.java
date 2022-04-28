public class SortMeMommy {
    public static int[] sort (int[] sortThingy) {
        boolean notSorted = true;
        while(notSorted) {
            int[] pastThingy = sortThingy.clone();

            for (int i = 0; i < sortThingy.length - 1; i++) {
                if(sortThingy[i] >= sortThingy[i + 1]) {
                    int number = sortThingy[i];
                    sortThingy[i] = sortThingy[i + 1];
                    sortThingy[i + 1] = number;
                }
            }
            notSorted = CompareMeDaddy.comparison(sortThingy, pastThingy);
        }
        return sortThingy;
    }
}
