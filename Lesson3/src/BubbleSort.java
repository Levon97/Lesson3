import java.util.Arrays;

  class BubbleSort {
    public static int[] arrayBubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {3,44,5,6,76,78,9,79,34,6,45,5,6,7,56,5,847};
        BubbleSort.arrayBubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
