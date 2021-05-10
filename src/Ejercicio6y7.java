import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Ejercicio6y7 {
    private JList lstGeneraciones;
    private JPanel panel1;
    private JButton btnGeneracion6;
    private JButton btnGeneracion7;
    private JLabel lblMensaje;
    private JButton btnVaciar;

    public Ejercicio6y7() {
        btnGeneracion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String pokemon = "Greninja";
                String pokemon1 = "Sylveon";
                String pokemon2 = "Aegislash";

                DefaultListModel modeloGen6 = new DefaultListModel();
                modeloGen6.addElement(pokemon);
                modeloGen6.addElement(pokemon1);
                modeloGen6.addElement(pokemon2);
                lstGeneraciones.setModel(modeloGen6);
                lblMensaje.setText(modeloGen6.toString());
            }
        });
        btnGeneracion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultListModel modeloGen7 = new DefaultListModel();
                modeloGen7.addElement("Mimikyu");
                modeloGen7.addElement("Rowlet");
                modeloGen7.addElement("Decidueye");
                lstGeneraciones.setModel(modeloGen7);
                lblMensaje.setText(modeloGen7.toString());
            }
        });
        lstGeneraciones.addComponentListener(new ComponentAdapter() {
        });
        lstGeneraciones.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
            lblMensaje.setText(lstGeneraciones.getSelectedValuesList().toString());
            }
        });
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            lblMensaje.setText(" ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio6");
        frame.setContentPane(new Ejercicio6y7().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(90, 180);
        frame.setVisible(true);
    }
}
