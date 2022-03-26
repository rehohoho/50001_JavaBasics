package mt_2018_starting_code.q2;

import java.util.Date;

public class AccountSol implements Comparable<AccountSol> {
    private String id = null;
    private double balance =0;
    private Date dateCreated = null;

    public AccountSol(String id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();

    }

    public String getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Account:"+this.id;
    }

    public int compareTo(AccountSol a) {
        if (this.balance > a.balance)
            return 1;
        else if (this.balance < a.balance)
            return -1;
        else
            return 0;
    }

}
