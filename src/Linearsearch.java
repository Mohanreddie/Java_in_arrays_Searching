import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int[] arr=new int[6];
        Scanner in=new Scanner(System.in);
        for(int j=0; j< arr.length;j++){
            arr[j]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target=in.nextInt();
        int answ=search(arr,target);
        System.out.println(answ);
    }
    static int search(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;

    }
}