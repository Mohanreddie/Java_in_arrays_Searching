import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        System.out.println("prgm starttd");
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count = count + (rem * rem * rem);
            n = n / 10;
        }
        System.out.println(count);
        if(n==count){
            System.out.println("The given number "+count+"is armstrong numver");
        }
        else{
            System.out.println("false");
        }
    }
}
