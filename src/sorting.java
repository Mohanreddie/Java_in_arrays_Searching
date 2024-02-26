import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        System.out.println("brocode!!");
        int[] arr = {3, 4, 2, 5, 6, 1, 7};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
//            System.out.println(arr[i]);
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
