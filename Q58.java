public class Q58{
  public static void main(String args[]){
    String s="hello world ";
    System.out.print(lengthOfLastWord(s));

  }

    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        
        String k = words[words.length-1];
        return k.length();
    }

}