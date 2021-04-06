package lesson4;

public class bubble_main {
    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 1, 8, 4};
        int countIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - countIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    int number = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = number;

                }
            }
        }
        countIndex++;
        for (int m : arr) {
            System.out.print(m + " ");
        }


    }
}
