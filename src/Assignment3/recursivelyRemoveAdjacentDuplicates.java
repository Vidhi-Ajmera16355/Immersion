package Assignment3;
import java.util.*;
public class recursivelyRemoveAdjacentDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(answer(s, ""));
    }

    private static String answer(String s, String ans){
        if (s.length() == 0) { 
            return ans;
        }
        if (s.length() > 1 && s.charAt(0) == s.charAt(1)) {
            return answer(s.substring(2), ans);
        } else {
            return answer(s.substring(1), ans + s.charAt(0));
        }
//        return ;
    }
}
