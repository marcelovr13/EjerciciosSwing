import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {
    private JPanel pnl1;
    private JPanel pnlColores;
    private JRadioButton rbnRojo;
    private JRadioButton rbnVerde;
    private JRadioButton rbnAzul;
    private JButton btnAceptar;
    private JLabel lblMensaje;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio2");
        frame.setContentPane(new Ejercicio2().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public Ejercicio2() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje = "Color elegido: ";
                if(rbnRojo.isSelected()){
                    mensaje = mensaje + "Rojo";
                }
                if(rbnVerde.isSelected()){
                    mensaje = mensaje + "Verde";
                }
                if(rbnAzul.isSelected()){
                    mensaje = mensaje + "Azul;";
                }
                lblMensaje.setText(mensaje);
            }
        });
    }


}
