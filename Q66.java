import java.util.Arrays;

public class Q66 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        // plusOne(arr)
        String ans =Arrays.toString(plusOne(arr));
        System.out.println(ans);
        
    }
    public static int[] plusOne(int[] digits) {
        String s = "";
    
        for (int num : digits) {
            s += num;
        }
    
        int number = Integer.parseInt(s);
        number += 1;
    
        String stringNumber = Integer.toString(number);
        int[] arr = new int[stringNumber.length()];
    
        for (int i = 0; i < stringNumber.length(); i++) {
            arr[i] = Character.getNumericValue(stringNumber.charAt(i));
        }
    
        return arr;
    }
    
}
