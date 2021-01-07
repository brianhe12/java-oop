
import java.lang.Math; 

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    
    /** Constructor */
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    /** Getters */
    public int getID(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    /** Setters */
    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        String rounded_balance = Double.toString(Math.round(balance*100.0)/100.0);
        //return customer+' balance=USD'+rounded_balance;
        return customer+" balance=$"+rounded_balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public void deposit(double amount){
        this.balance = this.balance+amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            this.balance = this.balance-amount;
        }
        else {
            System.out.println("Amount Withdrawn Exceeds the Current Balance");
        }

        
    }
}
