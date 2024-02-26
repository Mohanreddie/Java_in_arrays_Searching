import java.util.Arrays;

public class exm {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int[] arr={1,2,3,4,5};
        int x=3;
        int n=2;
        int ans=delete(arr,n,x);
        System.out.println(ans);

    }
    static int delete(int[] arr,int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x) {
                break;
            }
                if (i == n) {
                    return n;
                }
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
            return n-1;
        }
        return i;
    }
}