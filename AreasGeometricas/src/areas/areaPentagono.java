package areas;
import javax.swing.JOptionPane;
public class areaPentagono {

    public static void main(String[] arg){
        float lado, perimetro, apotema, area, entrada;

        entrada = Float.parseFloat(JOptionPane.showInputDialog("el valor del lado es: "));
        lado = entrada;
        apotema = Float.parseFloat(JOptionPane.showInputDialog("el valor del apotema es: "));
        perimetro = lado * 5;
        area = (perimetro * apotema)/2;
        JOptionPane.showMessageDialog(null, "el area del pentagono es: " + area);



    }

}
