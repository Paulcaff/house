import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {

        House house = new House();
        House house1 = new House("Tralee","Semi-d",125867,"Paul",25);

        JOptionPane.showMessageDialog(null,house.toString());
        JOptionPane.showMessageDialog(null,house1.toString());
    }
}
