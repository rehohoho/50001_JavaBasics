package ps2a;

public class q6_PermutationTester extends Tester<String> {

    public q6_PermutationTester(String[] inputs) {
        super(inputs);
    }

    @Override
    public void run(String input) {
        q6_Permutation p = new q6_Permutation(input);
        p.permute();
        System.out.println(p.getA());
    }

}
