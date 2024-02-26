import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        System.out.println("welcome");
        Scanner in= new Scanner(System.in);
        int[] arr= new int[5];
        for(int j=0;j< arr.length;j++){
            arr[j]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("The Max value is  ");
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int a=arr[0];
        for(int i=1;i<=4;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        return a;
    }
}
