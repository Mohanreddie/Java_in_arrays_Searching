public class java4 {
    public static void main(String[] args) {
        System.out.println("program started");
        for (int i=100;i<1000;i++){
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isarmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==original;

    }
}