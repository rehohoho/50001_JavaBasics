package ps2a;

public class q5_PalindromeTester extends Tester<String> {
    public q5_PalindromeTester(String[] inputs) {
        super(inputs);
    }

    @Override
    public void run(String input) {
        System.out.println(q5_Palindrome.isPalindrome(input.toCharArray()));
    }
}
