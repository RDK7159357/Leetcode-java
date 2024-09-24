import java.util.Arrays;

public class Q884 {
    public static void main(String[] args) {
        String s1="Hi hello";
        String s2="Hi RDK";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
        
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        // Split the sentences into words
        String[] srr1 = s1.split(" ");
        String[] srr2 = s2.split(" ");
        
        // Combine the two arrays
        int len1 = srr1.length;
        int len2 = srr2.length;
        String[] combined = new String[len1 + len2];
        
        int pos = 0;
        for (String element : srr1) {
            combined[pos] = element;
            pos++;
        }
        
        for (String element : srr2) {
            combined[pos] = element;
            pos++;
        }
        
        // Count occurrences of each word
        int[] count = new int[combined.length];
        for (int i = 0; i < combined.length; i++) {
            for (int j = 0; j < combined.length; j++) {
                if (combined[i].equals(combined[j])) {
                    count[i]++;
                }
            }
        }
        
        // Find the uncommon words
        int uncommonCount = 0;
        for (int i = 0; i < combined.length; i++) {
            if (count[i] == 1) {
                uncommonCount++;
            }
        }
        
        String[] result = new String[uncommonCount];
        int index = 0;
        for (int i = 0; i < combined.length; i++) {
            if (count[i] == 1) {
                result[index++] = combined[i];
            }
        }
        
        return result;
    }
    
}
