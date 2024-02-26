public class ceiling {
    public static void main(String[] args) {
        //Q:find the ceiling of a number
        //ceiling---> the number which is least greater number of a target
        //for example {1,2,3,4,5,6,8,9,14,28} if the target is 10 then least greater number is "14"
        int[] arr = {1, 3, 5, 6, 9, 24, 25};
        int target = 10;
        System.out.println(find(arr, target));

    }
//    static int find(int[] arr,int target){
//        int i = 0;
//        for( i=0;i<arr.length;i++){
//            if(arr[i] >= target) {
//                return arr[i];
//            }
//        }
////        return 1;
//        return i;
//    }
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
                    return arr[mid];

                }
            }
            return arr[start];

    }
}
