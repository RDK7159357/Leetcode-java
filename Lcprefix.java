public class Lcprefix{
  public static void main(String[] args) {
    String[] strs ={"flower","flow","flight"};
    System.out.print(longestCommonPrefix(strs));
    
  }    public static String longestCommonPrefix(String[] strs) {
    String res = "";
    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 0; j < strs.length; j++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c) {
          return res;
        }
      }
      res += c;
    }
    return res;
  }
}

