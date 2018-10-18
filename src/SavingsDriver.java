import javax.swing.*;

public class SavingsDriver {

    public static void main(String[] args) {


       SavingsAccount sa = new SavingsAccount();
       SavingsAccount sa2 = new SavingsAccount("Paul", 123456, 300);

        JOptionPane.showMessageDialog(null,sa.toString());
        JOptionPane.showMessageDialog(null,sa.calcTax());

        JOptionPane.showMessageDialog(null,sa2.toString());
        JOptionPane.showMessageDialog(null,sa2.calcTax());

        sa2.withdraw(100);

        JOptionPane.showMessageDialog(null,sa2.toString());

        sa2.lodge(100000);

        JOptionPane.showMessageDialog(null,sa2.toString());




    }
}
