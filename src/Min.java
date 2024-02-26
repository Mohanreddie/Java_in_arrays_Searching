public class Min {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums={12,34,22,33,9,22};
        System.out.println(min(nums));

    }
    static int min(int[] arr){
        int a=arr[0];
        for(int i=1;i<=4;i++){
            if(arr[i]<a){
                a=arr[i];
            }
        }
        return a;
    }
}
