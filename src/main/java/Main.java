import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] sortThingy = new int[10];
        for (int i = 0; i < sortThingy.length; i++) {
            sortThingy[i] = rand.nextInt(1000) + 1;
        }
        for (int i = 0; i < sortThingy.length; i++) {
            System.out.println(i + ": " + sortThingy[i]);
        }

        sortMeMommy(sortThingy);

        for (int i = 0; i < sortThingy.length; i++) {
            System.out.println(i + ": " + sortThingy[i]);
        }
    }

    public static void sortMeMommy(int[] sortThingy) {
        for (int i = 0; i < sortThingy.length; i++) {
            for (int j = 0; j < sortThingy.length-1; j++) {
                if(sortThingy[j] > sortThingy[j + 1]) {
                    int cache = sortThingy[j];
                    sortThingy[j] = sortThingy[j + 1];
                    sortThingy[j + 1] = cache;
                }
            }
        }
    }
}
