package mt_2018_starting_code.q2;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account account, Account t1) {
        return (int) (-account.getBalance() + t1.getBalance());
    }
}
