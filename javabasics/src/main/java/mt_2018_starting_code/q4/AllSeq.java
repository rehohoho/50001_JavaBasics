package mt_2018_starting_code.q4;

import java.util.ArrayList;

//starting code
public class AllSeq {
    public static void main(String[] args) {
        String[] s = {"p", "q"};
        System.out.println(compAllSeq(s, 3));

        String[] s2 = {"1", "2", "3", "4"};
        System.out.println(compAllSeq(s2, 1));
    }

    private static ArrayList<String> ans = new ArrayList<String>();

    public static ArrayList<String> compAllSeq(String[] s, int k){
        //TODO: implement recursive method to compute all possible sequences of length
        char[] in = String.join("", s).toCharArray();
        ans.clear();
        permuteDriver(in, new char[k], 0);
        return ans;
    }

    public static void permuteDriver(char[] s, char[] a, int j) {
        if (j == a.length) {
            ans.add(new String(a));
            return;
        }
        for (char c: s) {
            a[j] = c;
            permuteDriver(s, a, j+1);
        }
    }
}

