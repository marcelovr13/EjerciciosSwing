import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

    private JCheckBox chkPikipek;
    private JCheckBox chkTrumbeak;
    private JCheckBox chkToucannon;
    private JButton btnAceptar;
    private JLabel lblMensaje;
    private JPanel pnl1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio1");
        frame.setContentPane(new Ejercicio1().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
    public Ejercicio1() {

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje = "Pokémon/s elegido/s: ";
                if(chkPikipek.isSelected()) {
                    mensaje = mensaje + "Pikipek ";
                }
                if(chkTrumbeak.isSelected()){
                    mensaje = mensaje + "Trumbeak ";
                }
                if (chkToucannon.isSelected()){
                    mensaje = mensaje + "Toucannon ";
                }
                lblMensaje.setText(mensaje);
            }
        });

    }


}
