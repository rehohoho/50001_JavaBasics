package mt_2018_starting_code.q3;

public class Fish implements Observer {
    private String id;

    public Fish(String id) {
        this.id = id;
    }

    public Fish(String f1, TemperatureAlert westCoast) {
        this.id = f1;
        westCoast.register(this);
    }

    @Override
    public void update(int t) {
        if (t < 10 || t > 35) {
            System.out.println("Student " + id + " receives temperature alert: " + t);
        }
    }
}

