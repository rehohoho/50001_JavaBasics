package piwords;

import java.util.HashMap;
import java.util.Map;

public class WordFinder {
    private static int search(String pat, String txt, int base) {
        int prime = 1;
        int i, j;
        int hash = 1;
        for (i = 0; i < pat.length() - 1; i++) {
            hash = (hash * base) % prime;
        }

        int patHash = 0;
        int txtHash = 0;
        for (i = 0; i < pat.length(); i++) {
            patHash = (patHash * base + pat.charAt(i)) % prime;
            txtHash = (txtHash * base + txt.charAt(i)) % prime;
        }

        for (i = 0; i <= txt.length() - pat.length(); i++) {
            if (patHash == txtHash) {
                for (j = 0; j < pat.length(); j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) break;
                }
                if (j == pat.length()) return i;
            }

            if (i < txt.length() - pat.length()) {
                txtHash = txtHash - txt.charAt(i) * txtHash + txt.charAt(i + pat.length());
                txtHash = (base * txtHash) % prime;
                if (txtHash < 0) txtHash = (txtHash + prime);
            }
        }

        return -1;
    }

    /**
     * Given a String (the haystack) and an array of Strings (the needles),
     * return a Map<String, Integer>, where keys in the map correspond to
     * elements of needles that were found as substrings of haystack, and the
     * value for each key is the lowest index of haystack at which that needle
     * was found. A needle that was not found in the haystack should not be
     * returned in the output map.
     * 
     * @param haystack The string to search into.
     * @param needles The array of strings to search for. This array is not
     *                mutated.
     * @return The list of needles that were found in the haystack.
     */
    public static Map<String, Integer> getSubstrings(String haystack,
                                                     String[] needles) {
        HashMap<String, Integer> strFreq = new HashMap<String, Integer>();
        for (String pat: needles) {
            int found = WordFinder.search(pat, haystack, 26);
            if (found > -1) strFreq.put(pat, found);
        }
        return strFreq;
    }
}
