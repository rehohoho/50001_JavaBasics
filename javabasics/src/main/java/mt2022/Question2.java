package mt2022;

public class Question2 {

    public static void main(String[] args) {
        //outputs: 1 and 2
        System.out.println( distance( "kitten", "mitten") );
        System.out.println( distance( "kitten", "mitter") );
        System.out.println( distance( "kitten", "miaber") );
    }

    public static int distance(String a, String b) {
        if (b.length() == 0) return a.length();
        if (a.length() == 0) return b.length();

        if (a.charAt(0) == b.charAt(0)) {
            return distance(a.substring(1), b.substring(1));
        } else {
            return 1 + Math.min(
                Math.min(
                    distance(a.substring(1), b),
                    distance(a, b.substring(1))
                ),
                distance(a.substring(1), b.substring(1))
            );
        }
    }
}

