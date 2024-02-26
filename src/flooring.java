public class flooring {
    public static void main(String[] args) {
    //Q:find the floor of a number
    //floor---> the number which is biggest lesser number of a target
    //for example {1,2,3,4,5,6,8,9,14,28} if the target is 10 then biggest lesser number is "9"
    int[] arr = {3, 5, 6, 9, 24, 25};
    int target = 1;//if any number which is least in the array then the floor is -1.
    System.out.println(find(arr, target));
}
    static int find(int[] arr,int target){
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
        return end;

    }
}
