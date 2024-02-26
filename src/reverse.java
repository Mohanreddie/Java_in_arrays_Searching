import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int[] arr=new int[6];
        Scanner in=new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}