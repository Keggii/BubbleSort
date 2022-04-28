public class SortMeMommy {
    public static int[] sort (int[] sortThingy) {
        boolean notSorted = true;
        for (int i = 1; i > 0 && notSorted; i++) {
            int[] past = sortThingy;

            for (int j = 0; j < sortThingy.length - 2; j++) {
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
