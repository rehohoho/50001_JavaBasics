package mt_2018_starting_code.q3;

//starting code
public class Student implements Observer {
    private String id;

    public Student(String id) {
        this.id = id;
    }

    public Student(String s1, TemperatureAlert westCoast) {
        this.id = s1;
        westCoast.register(this);
    }

    @Override
    public void update(int t) {
        if (t < 10 || t > 35) {
            System.out.println("Student " + id + " receives temperature alert: " + t);
        }
    }
}
