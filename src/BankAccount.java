public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка! На вашей карте " +
                    "недостаточно денег для снятия данной суммы " +
                    "Остаток вашей карты составляет ", getAmount());
        }
        amount = amount - sum;

    }


}
