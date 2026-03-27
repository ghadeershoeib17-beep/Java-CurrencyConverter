import javax.swing.*;
import java.awt.*;

class Currency {
    String name;
    double rate;
    Currency(String name, double rate) { this.name = name; this.rate = rate; }
    public String toString() { return name; }
}

public class CurrencyConverterGUI {
    public static void main(String[] args) {
        Currency[] list = { new Currency("USD", 1.0), new Currency("EUR", 0.85), new Currency("SAR", 3.75) };
        JFrame f = new JFrame("Converter");
        JComboBox<Currency> from = new JComboBox<>(list);
        JComboBox<Currency> to = new JComboBox<>(list);
        JTextField t = new JTextField(10);
        JButton btn = new JButton("Convert");
        JLabel res = new JLabel("Result: ");

        btn.addActionListener(e -> {
            try {
                double v = Double.parseDouble(t.getText());
                Currency x = (Currency) from.getSelectedItem();
                Currency y = (Currency) to.getSelectedItem();
                res.setText("Result: " + String.format("%.2f", (v / x.rate) * y.rate) + " " + y.name);
            } catch (Exception ex) { res.setText("Error!"); }
        });

        f.setLayout(new FlowLayout());
        f.add(from); f.add(to); f.add(t); f.add(btn); f.add(res);
        f.setSize(300, 200); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setVisible(true);
    }
}
