package mx.utng.s24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reto1 extends JFrame {
    private JTextField txtNum1;
    private JTextField txtNum2;

    public Reto1() {
        super("Suma");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JLabel lblNum1 = new JLabel("Numero 1: ");
        JLabel lblNum2 =new JLabel("Numero 2: ");

        txtNum1 = new JTextField();
        txtNum2 = new JTextField();

        JButton btnSuma = new JButton("Sumar");

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(txtNum1.getText());
                float num2 = Float.parseFloat(txtNum2.getText());
                float resultado = num1 + num2;
             JOptionPane.showMessageDialog(null, "La suma es: "+resultado);

            }
        });
        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(btnSuma);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Reto1();
    }
    

}


