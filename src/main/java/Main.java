import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] sortThingy = new int[10];
        for (int i = 0; i < sortThingy.length - 1; i++) {
            sortThingy[i] = rand.nextInt(1000) + 1;
        }
        for (int i = 0; i < sortThingy.length - 1; i++) {
            System.out.println(i + ": " + sortThingy[i]);
        }

        int[] sortedThingy = SortMeMommy.sort(sortThingy);

        for (int i = 0; i < sortedThingy.length - 1; i++) {
            System.out.println(i + ": " + sortedThingy[i]);
        }
    }
}
