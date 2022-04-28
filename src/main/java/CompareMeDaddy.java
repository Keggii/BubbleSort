public class CompareMeDaddy {
    public static boolean comparison(int[] sortThingy, int[] pastThingy) {
        boolean notSorted = false;
        for (int i = 0; i < sortThingy.length && !notSorted; i++) {
            if (sortThingy[i] != pastThingy[i]) {
                notSorted = true;
                break;
            }
            notSorted = false;
        }
        return notSorted;
    }
}
