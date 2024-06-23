package TwoPointers;
public class reverseVowel {
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
