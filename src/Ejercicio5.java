import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 {
    private JComboBox cmbModoDeJuego;
    private JPanel panel1;
    private JLabel lblMensaje;

    public Ejercicio5() {
        cmbModoDeJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String mensaje = "El modo de juego elegido es: " + cmbModoDeJuego.getSelectedItem().toString();
            lblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio5");
        frame.setContentPane(new Ejercicio5().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
