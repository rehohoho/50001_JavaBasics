package ps2a;

public class MyClass {
    public static void main(String[] args) {
//        q1_OctagonComparableTester q1_octagonComparableTester = new q1_OctagonComparableTester(
//                new Integer[][]{{2, 3, 1}});
//        q2_OctagonComparatorTester q2_octagonComparatorTester = new q2_OctagonComparatorTester(
//                new Integer[][]{{2, 3, 1}});
//        q3_SubscriberTester subscriberTester = new q3_SubscriberTester(new Double[]{0.0});
//        q4_InheritanceInterfacesTest inheritanceInterfacesTest = new q4_InheritanceInterfacesTest(new Integer[]{0});
//        q5_PalindromeTester palindromeTester = new q5_PalindromeTester(new String[] {"abba", "adbcba", "ZZaZZ", "123421"});
//        q6_PermutationTester permutationTester = new q6_PermutationTester(new String[] {"hat"});
        q7_GetPathTester getPathTester = new q7_GetPathTester(new int[][][] {
            {
                {0,0,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,1,0,0}},
            {
                {0,0,0,0},
                {0,0,1,0},
                {0,1,0,1},
                {0,1,0,0}
            },
            {
                {0,0,0,0,0},
                {0,1,0,1,0},
                {0,1,0,0,0},
                {0,1,0,1,0}
            }
        });
    }
}
