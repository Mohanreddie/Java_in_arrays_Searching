public class example {
        public static void main(String[] args){
            int[] arr={5,2,3,1};
            System.out.println(sortArray(arr));
        }
        static int[] sortArray(int[] nums) {
            int i=0;
            for(i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
            return new int[]{nums[i]};
        }
    }
