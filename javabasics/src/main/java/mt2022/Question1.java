package mt2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {

        //output: 25
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumThreeAndSeven(values));

        // output: shnydys
        System.out.println( dropVowelsAndCase("SHINYDays")); //shnydys
        System.out.println( dropVowelsAndCase("AEIoUojKElM"));

        // output: [3, 0, 2, 2, 4, 6, 10]
        System.out.println(someSequence(6));
        // output: [3, 0, 2, 2]
        System.out.println(someSequence(3));
        System.out.println(someSequence(0));
        System.out.println(someSequence(100));
    }

    public static int sumThreeAndSeven( int[] values){
        int sum = 0;
        for (int val: values) {
            if (val % 3 == 0 || val % 7 == 0) {
                sum += val;
            }
        }
        return sum;
    }

    public static String dropVowelsAndCase(String s){
        String s1 = s.toLowerCase();
        ArrayList<Character> ans = new ArrayList<Character>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' ||
                    s1.charAt(i) == 'e' ||
                    s1.charAt(i) == 'i' ||
                    s1.charAt(i) == 'o' ||
                    s1.charAt(i) == 'u') {
                continue;
            }
            ans.add(s1.charAt(i));
        }

        char[] ans2 = new char[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans2[i] = ans.get(i);
        }
        return new String(ans2);
    }

    public static ArrayList<Integer> someSequence(int n){
        if (n == 0) return new ArrayList<>(Arrays.asList(3));
        if (n == 1) return new ArrayList<>(Arrays.asList(3, 0));
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(3, 0, 2));

        int p = 0;
        int q = 2;
        int temp;

        for (int i = 2; i < n; i++) {
            temp = q;
            q = p + q;
            p = temp;
            ans.add(q);
        }
        return ans;
    }
}