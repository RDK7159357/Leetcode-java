public class Q169 {
    public static void main(String[] args) {
        int [] nums={1,1,2,2,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int res =0;
        for(int num: nums){
            if(count==0){
                res=num;
            }
            if(num==res){
                count++;
            }
            else{
                count--;
            }
        }
        return res;
    }
}
