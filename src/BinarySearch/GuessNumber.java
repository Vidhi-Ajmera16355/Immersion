package BinarySearch;

public class GuessNumber {

    public static void main(String[] args) {
        int n = 10;
        int l = 1;
        int r = n;
        while (l <= r) {
            int guess_no = l + (r - l) / 2;
            int val = guess(guess_no);
            if (val == 0) {
                System.out.println("The picked number is: " + guess_no);
                break; // Exit the loop as we found the number
            } else if (val == -1) {
                r = guess_no - 1;
            } else {
                l = guess_no + 1;
            }
        }
    }

    public static int guess(int num) {
        int pickedNumber = 6; // Example picked number, replace as needed
        if (num < pickedNumber) {
            return 1;
        } else if (num > pickedNumber) {
            return -1;
        } else {
            return 0;
        }
    }
}
