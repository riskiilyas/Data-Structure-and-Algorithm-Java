package sort;

import java.util.Random;
public class ArrayManager {
    static Random random = new Random();
    static int[] makeRandom(int max, int range) {
        int[] arrayReturn = new int[range];
        for (int i = 0; i < range; i++) {
            arrayReturn[i] = random.nextInt(max);
        }
        return arrayReturn;
    }

    static void printArray(int[] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++) {
            if (i == arrayInput.length-1) {
                System.out.print(arrayInput[i] + "\n");
            } else {
                System.out.print(arrayInput[i] + " , ");
            }
        }
    }
}
