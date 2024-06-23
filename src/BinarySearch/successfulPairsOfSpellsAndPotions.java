package BinarySearch;
import java.util.*;
public class successfulPairsOfSpellsAndPotions { 
	    public static  int binarySearch(int l, int r, List<Integer> potions, int target) {
	        // We have to find the index of the first element greater than or equal to the target (minPotion)
	        int index = -1;
	        int mid = 0;
	        while (l <= r) {
	            mid = l + (r - l) / 2;

	            if (potions.get(mid) >= target) {
	                index = mid;
	                r = mid - 1; //check more values on left!!
	            } else {
	                l = mid + 1;
	            }
	        }
	        return index;
	    }
	    public static List<Integer> successfulPairs(List<Integer> spells, List<Integer> potions, long success) {
	        int m = spells.size();
	        int n = potions.size();
	        Collections.sort(potions);
	        int maxPotion = potions.get(n - 1);
	        List<Integer> answer = new ArrayList<>();
	        for (int i = 0; i < m; i++) {
	            int spell = spells.get(i);
	            long minPotion = (long) Math.ceil((1.0 * success) / spell);
	            if (minPotion > maxPotion) {
	                answer.add(0);
	                continue;
	            }
	            int index = binarySearch(0, n - 1, potions, (int) minPotion);
	            answer.add(n - index);
	        }
	        return answer;
	    }
	    public static void main(String[] args) { 
	        List<Integer> spells = Arrays.asList(3, 1, 2);
	        List<Integer> potions = Arrays.asList(8, 5, 10);
	        long success = 16;
	        List<Integer> result =successfulPairs(spells, potions, success);
	        System.out.println("Resulting successful pairs for each spell:");
	        for (int i = 0; i < result.size(); i++) {
	            System.out.println("Spell " + (i + 1) + ": " + result.get(i));
	        }
	    }
	}
