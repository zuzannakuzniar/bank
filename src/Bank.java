public class Bank {
    public static void main (String[] args) {
        Account konto1 = new Account();
        konto1.setLogin("zuzekk");
        konto1.setBalance(3000);

        konto1.getLogin();
        konto1.getBalance();

        System.out.println(konto1);
    }
}
