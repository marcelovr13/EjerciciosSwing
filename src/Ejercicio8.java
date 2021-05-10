import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 {
    private JComboBox cmbNumeros;
    private JPanel panel1;
    private JButton btnPares;
    private JButton btnImpares;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio8");
        frame.setContentPane(new Ejercicio8().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio8() {
        btnPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Número 0");
                modelo.addElement("Número 2");
                modelo.addElement("Numero 4");
                modelo.addElement("Numero 6");
                modelo.addElement("Numero 8");
                cmbNumeros.setModel(modelo);
            }
        });
        cmbNumeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            lblMensaje.setText(cmbNumeros.getSelectedItem().toString());
            }
        });
        btnImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
                modelo1.addElement("Número 1");
                modelo1.addElement("Número 3");
                modelo1.addElement("Número 5");
                modelo1.addElement("Número 7");
                modelo1.addElement("Número 9");
                cmbNumeros.setModel(modelo1);
            }
        });
    }
}
