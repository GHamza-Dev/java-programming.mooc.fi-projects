public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of "+this.balance+" euros";
    }

    public void eatAffordably() {
        double newBalance = this.balance - 2.60;
        if (newBalance >= 0) {
            this.balance = newBalance;
        }
    }

    public void eatHeartily() {
        double newBalance = this.balance - 4.60;
        if (newBalance >= 0) {
            this.balance = newBalance;
        }
    }

    public void addMoney(double amount) {

        if (amount < 0) {
            return;
        }

        double newBalance = this.balance + amount;
        if (newBalance < 150) {
            this.balance = newBalance;
        }else {
            this.balance = 150;
        }
    }
}