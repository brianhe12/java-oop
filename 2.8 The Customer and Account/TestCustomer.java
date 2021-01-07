
public class TestCustomer {
    public static void main(String[] args){
        Customer Bob = new Customer(117,"Bob",'M');
        Account Chase = new Account(1736291,Bob);

        System.out.println(Chase);
        System.out.println(String.format("%s %d", "ID:", Chase.getID()));
        System.out.println(String.format("%s %s", "Customer:",Chase.getCustomer()));
        System.out.println(String.format("%s %s", "Name:",Chase.getCustomerName()));
        System.out.println(String.format("%s %.2f", "Balance:",Chase.getBalance()));

        Chase.setBalance(100000);
        Chase.deposit(50000);
        Chase.withdraw(20000);

        System.out.println(String.format("%s %.2f", "Balance:",Chase.getBalance()));

        Chase.withdraw(300000);
        
        System.out.println(String.format("%s %.2f", "Balance:",Chase.getBalance()));
    }
}
