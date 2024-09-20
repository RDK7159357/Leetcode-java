import java.math.BigInteger;
public class Q43 {
    public static void main(String[] args) {
        String num1="2",num2="3";
        System.out.println(multiply(num1,num2));
        
    }
    public static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();

}
    
}
