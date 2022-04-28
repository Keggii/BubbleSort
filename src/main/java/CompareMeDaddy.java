public class CompareMeDaddy {
    public static boolean comparison(int[] sortThingy, int[] past) {
        boolean notSorted = true;
        for (int i = 0; i < sortThingy.length - 1; i++) {
            if (sortThingy[i] != past[i]) {
                notSorted = true;
                break;
            }
            notSorted = false;
        }
        return notSorted;
    }
}
