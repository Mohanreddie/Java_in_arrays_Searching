import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        System.out.println("come on dude let's do it");
        //directly initializing 2D array
        int[][] nums={
                {1,2,3},
                {11,22,33,44},
                {111,232,333,444},
                {123,23,44,55}
        };
        int target=23;
        //to keep ans in Array form we are using int[] ans
        int[] ans=search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    //to return exact index answer
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}