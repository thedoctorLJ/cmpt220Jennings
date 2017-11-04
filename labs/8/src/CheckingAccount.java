/*
*                              CheckingAccount                             *
*--------------------------------------------------------------------------*
* -overdraftLimit: double                                                  *
* +CheckingAccount()                                                       *
* +CheckingAccount(newId: int, newBalance: double, overdraftLimit: double) *
* +setOverdraftLimit(overdraftLimit: double): void                         *
* +getOverdraftLimit(): double                                             *
* +withdraw(amount: double): boolean                                       *
* +toString(): String                                                      *
*/
public class CheckingAccount extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+
                "mBalance=" + mBalance +
                '}';
    }
}