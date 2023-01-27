import javax.swing.*;
public class KnightDriver {
    public static void main(String[] args) {
        Knight k = new Knight();
        Stars s = new Stars();

        JTextField name = new JTextField(),
                health = new JTextField(),
                age = new JTextField(),
                gold = new JTextField(),
                battles = new JTextField(),
                starsRows = new JTextField(),
                starsColumns = new JTextField();

        JLabel namePrompt = new JLabel("Enter your knight's full name: "),
                healthPrompt = new JLabel("Enter your knight's initial health: "),
                agePrompt = new JLabel("Enter your knight's age: "),
                goldPrompt = new JLabel("Enter your knight's initial gold: "),
                battlesPrompt = new JLabel("Enter your knight's number of battles: "),
                starsRowsPrompt = new JLabel("Enter number of star rows: "),
                starsColumnsPrompt = new JLabel("Enter number of star columns: ");

        JPanel inputPanel = new JPanel();

        inputPanel.add(namePrompt);
        inputPanel.add(name);

        inputPanel.add(healthPrompt);
        inputPanel.add(health);

        inputPanel.add(agePrompt);
        inputPanel.add(age);

        inputPanel.add(goldPrompt);
        inputPanel.add(gold);

        inputPanel.add(battlesPrompt);
        inputPanel.add(battles);

        inputPanel.add(starsRowsPrompt);
        inputPanel.add(starsRows);

        inputPanel.add(starsColumnsPrompt);
        inputPanel.add(starsColumns);

        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        int option = JOptionPane.showConfirmDialog(null,
                inputPanel,
                null,
                JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            k.setName(name.getText());
            k.setAge(Integer.parseInt(age.getText()));
            k.setHealth(Integer.parseInt(health.getText()));
            k.setGold(Integer.parseInt(gold.getText()));
            k.setBattles(Integer.parseInt(battles.getText()));

            s.setRows(Integer.parseInt(starsRows.getText()));
            s.setColumns(Integer.parseInt(starsColumns.getText()));
        }


        System.out.printf("Knight Name: %s%n" +
                        "Knight Health: %d%n" +
                        "Knight Age: %d%n" +
                        "Knight Battles: %d%n" +
                        "Knight Gold: %d%n",
                k.getName(), k.getHealth(), k.getAge(), k.getBattles(), k.getGold());

        String stars = "";

        for (int i = 0; i < s.rows; i ++) {
            if (i % 2 == 0) stars += " ";

            for (int j = 0; j < s.columns; j++) {
                stars += "* ";

            }
            stars += "\n";
        }

        System.out.print(stars);
    }
}
