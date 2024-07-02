package Assignment3;
import java.util.*;

public class additiveNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(additive(s, new ArrayList<Integer>()));
    }
    static boolean additive(String s, List<Integer> ll) {
        if (s.length() == 0) return ll.size() >= 3;
        for (int i = 1; i <= s.length(); i++) {
            String p = s.substring(0, i);
            String r = s.substring(i);
            if (startsWithZero(p) && isValidSum(ll, p)) {
                String curr = p;
                ll.add(Integer.parseInt(curr));
                if (additive(r, ll)) {
                    return true;
                }
                ll.remove(ll.size() - 1);
            }
        }
        return false;
    }

    static boolean startsWithZero(String curr) {
        return curr.length() == 1 || curr.charAt(0) != '0';
    }

    static boolean isValidSum(List<Integer> ll, String curr) {
        if (ll.size() < 2) {
            return true;
        }
        int last = ll.get(ll.size() - 1);
        int secLast = ll.get(ll.size() - 2);
        return Integer.parseInt(curr) == (last + secLast);
    }
}
