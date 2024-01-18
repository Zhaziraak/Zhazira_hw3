public class Main {
    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        System.out.println(" Ваш счет пополнен на сумму 15000 сом");

        try {
            while (true) {
                bankAccount.withDraw(6000);
                System.out.println("С вашей карты снято 6000 сом " +
                        "Остаток вашей карты составляет " + bankAccount.getAmount());
            }
        } catch (LimitException e) {
            try {
                bankAccount.withDraw((int) e.getRemainingAmount());
            }catch (LimitException ex){
                System.out.println(ex.getMessage());
            }

        }
        System.out.println("С карты снят весь остаток." +
                " На данный момент баланс составляет " + bankAccount.getAmount() + " cом");

    }
}