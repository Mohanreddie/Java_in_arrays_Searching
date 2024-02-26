 class Smallestletter {
     public static void main(String[] args) {
         char[] letters={'a','b','f','j'};
         char target='j';
         System.out.println(nextGreatestletter(letters,target));
     }
     //leetcode question
    public static char nextGreatestletter(char[] letters, char target){
            int start=0;
            int end= letters.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            return letters[start%letters.length];

        }
    }
