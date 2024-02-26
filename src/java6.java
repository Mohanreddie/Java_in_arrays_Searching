import jdk.jshell.StatementSnippet;

import java.util.Arrays;
import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}