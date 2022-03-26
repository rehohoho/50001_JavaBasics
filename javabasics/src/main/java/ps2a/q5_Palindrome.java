package ps2a;

public class q5_Palindrome {
    public static boolean isPalindrome (char[] S) {
        // keep pointers to do in-place
        return isPalindromeDriver(S, 0, S.length - 1);
    }

    private static boolean isPalindromeDriver(char[] S, int start, int end) {
        if (start >= end) return true;
        if (S[start] == S[end]) {
            return isPalindromeDriver(S, start + 1, end - 1);
        }
        return false;
    }
}

/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/
