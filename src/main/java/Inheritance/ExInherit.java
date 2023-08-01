package Inheritance;

public class ExInherit {

    // 1. Use inheritance to create a program that will include a Bank Account, a Credit Card account and a Savings Account
    // 2. The default amount for each account can be 0
    // 3. All classes can print the “Account details:” message
    // 4. Provide the following values for each of the 2 accounts:t

    /*
    Credit Card account:
        - amount = 10000
        - fee = 5
    Savings Account:
        - amount = 2500
        - interest = 3.75
    */
    // 5. Print the following statements and values, in a separate class called “ExInherit”:
    /*
        - "Account details:"

    For Credit Card account, print:
        - "Credit card amount $:" + assigned value
        - "Credit card monthly fee $:" + assigned value

    For Savings Account, print:
        - "Savings account amount $:" + assigned value
        - "Savings account amount %:" + assigned value
    */
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        CreditCard cred = new CreditCard();
        SavingsAccount save = new SavingsAccount();

        acc.info();

        System.out.println("Credit card amount $: " + cred.amount);
        System.out.println("Credit card monthly fee $: " + cred.fee);

        System.out.println("Savings account amount $: " + save.amount);
        System.out.println("Savings account amount %: " + save.interest);

    }

}
