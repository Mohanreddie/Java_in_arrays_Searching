import javax.xml.namespace.QName;
import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=in.next();
        String naam= details(name);
        System.out.println(naam);
    }
    static String details(String name) {
        String message="hello "+ name;
        return message;
    }

}
