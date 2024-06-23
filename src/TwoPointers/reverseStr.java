package TwoPointers;
public class reverseStr {
    public static void main(String[] args) {
        String s = "the eky is blue       ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
    	String[] str=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out+=str[i]+" ";
        }
        return out + str[0];
    }
    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end - 1];
            chars[end - 1] = temp;
            start++;
            end--;
        }
    }
}
