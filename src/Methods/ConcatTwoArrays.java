package Methods;

import java.util.Arrays;

public class ConcatTwoArrays {
  /*  public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int a = array1.length;
        int b = array2.length;
        int[] result = new int[a + b];

        System.arraycopy(array1, 0, result, 0, a);
        System.arraycopy(array2, 0, result, a, b);

        System.out.println(Arrays.toString(result));


    }



   */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int a = 0;
        for (int element : array1) {
            result[a] = element;
            a++;
        }

        for (int element : array2) {
            result[a] = element;
            a++;
        }

        System.out.println(Arrays.toString(result));
    }
}



