package ps2a;

public class q3_SubscriberTester extends Tester<Double> {

    public q3_SubscriberTester(Double[] inputs) {
        super(inputs);
    }

    @Override
    public void run(Double input) {
        AirPollutionAlert singaporeAlert = new AirPollutionAlert();
        Subscriber man = new Subscriber("man", singaporeAlert);
        Subscriber simon = new Subscriber("simon", singaporeAlert);

//        for (double inp: input) {
//            singaporeAlert.setAirPollutionIndex(inp);
//        }
        singaporeAlert.setAirPollutionIndex(200);
        singaporeAlert.setAirPollutionIndex(50);
        singaporeAlert.setAirPollutionIndex(120);

        singaporeAlert.unregister(man);
        singaporeAlert.setAirPollutionIndex(300);
    }
}
