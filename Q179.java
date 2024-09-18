import java.util.Arrays;
public class Q179 {
    public static void main(String[] args) {
       int [] numbers={23, 456, 789};
     
        System.out.println(largestNumber(numbers));
    }
    public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(str, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        if (str[0].equals("0")) {
            return str[0];
        }
        StringBuilder ans = new StringBuilder();
        for (String s : str) {
            ans.append(s);
        }
        return ans.toString();
    }
}
   // String s="";
        // String s1="";
        // for (int number : numbers) {
        //     while (number > 0) {
        //         int digit = number % 10;
        //         // System.out.print(digit);
        //         s+=digit;
        //         number /= 10;
        //     }
        // }
        // // System.out.println(s);
        // char arr[] = new char[s.length()];
        // for(int i=0;i<s.length();i++){
        //     // System.out.print(s.charAt(i)+" ");    
        //     arr[i]=s.charAt(i);
        // }
        // Arrays.sort(arr);
        // for(int i=arr.length-1;i>=0;i--){
        //     s1+=arr[i];
        // }
        // // System.out.println(Arrays.toString(arr));
        // System.out.println(s1);