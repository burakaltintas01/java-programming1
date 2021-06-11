package day46_encapsulation;

public class Bank {
    public static void main(String[] args) {
        CheckingAccount bank1 = new CheckingAccount();
        bank1.setAccountNumber(98978546);
        System.out.println("Account number " + bank1.getAccountNumber());

        bank1.setBalance(4594);
        System.out.println("Your balance is " + bank1.getBalance());

        bank1.setAccountHolder("Burak Altintas");
        System.out.println("AccountHolder = " + bank1.getAccountHolder());

        bank1.setType("Checking");
        System.out.println("Type = " + bank1.getType());
    }
}
