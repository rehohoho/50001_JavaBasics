package mt_2018_starting_code.q2;

import java.util.Date;

public class Account implements Comparable<Account> {
    private String id;
    private double balance;
    private Date dateCreated;

    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account: " + id;
    }

    @Override
    public int compareTo(Account account) {
        return (int) (balance - account.balance);
    }
}
