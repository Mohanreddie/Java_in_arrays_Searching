import java.util.Arrays;

public class findchar {
    public static void main(String[] args) {
        System.out.println("good luck dude");
        String name="Mohanreddy nimmakayala";
        char ch='d';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,ch));

    }
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch:str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }
        return false;
    }
}