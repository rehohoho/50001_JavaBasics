package mt_2018_starting_code.q3;

import java.util.ArrayList;

//starting code
public class TemperatureAlert implements Subject {
    private int temperature;
    private ArrayList<Observer> obs = new ArrayList<>();

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }


    @Override
    public void register(Observer o) {
        if (!obs.contains(o)) {
            obs.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        if (obs.contains(o)) {
            obs.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o: obs) {
            o.update(temperature);
        }
    }
}
