import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={45,36,34,12,9,2,3,4,5,11,23};
        System.out.println("brocode!!");
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
        int target=11;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}