package mt_2018_starting_code.q3;

//starting code
interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
