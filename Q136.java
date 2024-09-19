import java.util.Arrays;
public class Q136 {
    public static void main(String[] args) {
        int []nums={1,3,2,3,4};
        System.out.println(singleNumber(nums));
        
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
    }
    
    
}
