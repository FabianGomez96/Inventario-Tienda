
package interfazgraficareto3;
import javax.swing.WindowConstants;

/**
 *
 * @author Oscar  Gomez
 */
public class InterfazGraficaReto3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        VentanaPrincipal vp= new VentanaPrincipal();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        vp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vp.setResizable(false);
    }
}
