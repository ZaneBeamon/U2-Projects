import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RPGCharacterGUI {

    public static void main(String[] args) {
        JFrame window = new JFrame("Character Stats");
        JPanel panel = new JPanel();
        JButton Strength = new JButton("Strength: ");
        JButton Mana = new JButton("Mana: ");
        JButton Health = new JButton("Health: ");
        JButton Level = new JButton("Level: ");

        window.setSize(200, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        panel.add(Strength);
        panel.add(Mana);
        panel.add(Health);
        panel.add(Level);
        window.add(panel);
        Strength.addActionListener(new StrengthListener());
        Mana.addActionListener(new ManaListener());
        Health.addActionListener(new HealthListener());
        Level.addActionListener(new LevelListener());
    }
    private static class StrengthListener implements ActionListener{
        public void actionPerformed(ActionEvent e){ JOptionPane.showInputDialog(null, StrengthListener);
        }
    }
    private static class ManaListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {JOptionPane.showInputDialog(null, "Mana: " + ManaListener);}
    }
    private static class HealthListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {JOptionPane.showInputDialog(null, "Health: " + HealthListener);}
    }
    private static class LevelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {JOptionPane.showInputDialog(null, "Level: " + LevelListener);}
    }

}
