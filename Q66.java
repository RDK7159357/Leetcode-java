import java.math.BigInteger;
import java.util.Arrays;

public class Q66 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        // plusOne(arr)
        String ans =Arrays.toString(plusOne(arr));
        System.out.println(ans);
        
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();

        for (int num : digits) {
            s.append(num);
        }

        BigInteger number = new BigInteger(s.toString());
        number = number.add(BigInteger.ONE);

        String stringNumber = number.toString();
        int[] arr = new int[stringNumber.length()];

        for (int i = 0; i < stringNumber.length(); i++) {
            arr[i] = Character.getNumericValue(stringNumber.charAt(i));
        }

        return arr;
    }
    
}
