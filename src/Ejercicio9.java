import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ejercicio9 {
    private JSlider sldNivel;
    private JPanel panel1;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio9");
        frame.setContentPane(new Ejercicio9().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio9() {
        sldNivel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {

                lblMensaje.setText("El nivel del pokémon es: "+ sldNivel.getValue());
            }
        });
        sldNivel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                sldNivel.setMinimum(0);
                sldNivel.setMaximum(50);
                sldNivel.setValue(5);
                sldNivel.setMajorTickSpacing(5);
                sldNivel.setPaintTicks(true);
                sldNivel.setPaintLabels(true);
            }
        });
    }
}
