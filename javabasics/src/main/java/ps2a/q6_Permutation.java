package ps2a;

import java.util.ArrayList;

public class q6_Permutation {
    private final String in;
    private char[] inArr;
    private ArrayList<String> a = new ArrayList<String>();

    q6_Permutation(final String str){
        in = str;
        inArr = in.toCharArray();
    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        a.clear();
        permuteDriver(0);
    }

    private void permuteDriver(int frontIdx) {
        if (frontIdx == in.length() - 1) {
            a.add(new String(inArr));
        }

        for (int i = frontIdx; i < in.length(); i++) {
            char temp = inArr[frontIdx];
            inArr[frontIdx] = inArr[i];
            inArr[i] = temp;

            permuteDriver(frontIdx + 1);

            temp = inArr[frontIdx];
            inArr[frontIdx] = inArr[i];
            inArr[i] = temp;
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}

