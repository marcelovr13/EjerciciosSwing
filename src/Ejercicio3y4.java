import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3y4 {
    private JPanel pnl3;
    private JList lstHabilidades;
    private JButton btnAceptar;
    private JLabel lblMensaje;


    public Ejercicio3y4() {
        lstHabilidades.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje;
                mensaje = "La/s habilidad/es seleccionada/s es/son: " + lstHabilidades.getSelectedValuesList().toString();
                lblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio3");
        frame.setContentPane(new Ejercicio3y4().pnl3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
