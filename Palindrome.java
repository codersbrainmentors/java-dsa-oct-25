public class Palindrome {
    static boolean isPalindrome(int org, int reverse, int copy) {
        if (org == 0) {
            return reverse == copy; //
        }
        int singleDigit = org % 10;
        reverse = reverse * 10 + singleDigit;
        return isPalindrome(org / 10, reverse, copy);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(876, 0, 121) ? "Palindrome Number " : "Not Palindrome Number");
    }
}
