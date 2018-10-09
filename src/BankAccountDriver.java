import javax.swing.*;

public class BankAccountDriver
{
    public static void main(String[] args)
    {
       whole();

    }
    public static String whole()
    {

        String balanceAsString = JOptionPane.showInputDialog("Please enter your balance: ");
        double balance = Double.parseDouble(balanceAsString);

        BankAccount account1 = new BankAccount();

        BankAccountName accountCustomer = new BankAccountName();
        accountCustomer.setName(JOptionPane.showInputDialog("Please enter your name: "));


        account1.setAccnum("3245");
        account1.setBalance(balance);
        account1.setCustomer(accountCustomer);

        String bankAccounts [] = new String[]{account1.toString()};
        JOptionPane.showMessageDialog(null, "" + account1.toString());

        BankAccount.lodgement(balance);
        System.exit(0);
        return account1.toString();
    }




}
