import javax.swing.*;

public class BankAccount
{
    private String accnum;
    private double balance;
    private String name;
    private BankAccountName customer = new BankAccountName();
    //class but it needs a seperate class that includes their name with
    //appropriate getters,setters and to string methods

    //mutator methods

    public void setAccnum(String accnum)
    {
        this.accnum = accnum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCustomer(BankAccountName customer)
    {
        this.customer = customer;
    }

    //Accessor methods

    public String getAccnum()
    {
        return accnum;
    }

    public double getBalance()
    {
        return balance;
    }

    public BankAccountName getCustomer() {
        return this.customer;
    }

    //no argument constructor method

    public BankAccount()
    {
        this.accnum="unknown";
        this.balance=0.00;
        this.customer=null;
    }


    public static void lodgement(double balance)
    {
        String optionL=JOptionPane.showInputDialog("Do you want to lodge money to this account? ");

        if (optionL.equals("y"))
        {
            String newBalanceAsString = JOptionPane.showInputDialog("Please enter the amount of money you have lodged");
            double newBalance = Double.parseDouble(newBalanceAsString);
            newBalance += balance;
            JOptionPane.showMessageDialog(null, "Your new balance is: " + newBalance);
        }
        String optionW=JOptionPane.showInputDialog("Do you want to withdraw money from this account? ");

        if (optionW.equals("y"))
        {
            String newBalanceAsString = JOptionPane.showInputDialog("Please enter the amount of money you want to withdraw");
            double newBalance = Double.parseDouble(newBalanceAsString);
            balance -= newBalance;
            JOptionPane.showMessageDialog(null, "Your new balance is: " + balance);
        }

        else
        {
            System.exit(0);
        }

    }

    //3 argument constructor


    public BankAccount(String accnum,double balance,BankAccountName customer)
    {
        this.balance=balance;
        this.accnum=accnum;
        this.customer=customer;
    }

    //toString method



    public String toString() {
        return customer.toString() + "\n" + getBalance() + "\n" + getAccnum();
    }
}
