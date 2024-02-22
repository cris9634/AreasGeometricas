package areas;
import javax.swing.JOptionPane;
public class areaDelRombo {
    public static void main (String[] args){
        float ladoM,ladom,area;

        ladoM = Float.parseFloat(JOptionPane.showInputDialog("digite el valor del ladoM = "));
        ladom = Float.parseFloat(JOptionPane.showInputDialog("digite el valor del ladom = "));
        area = (ladoM * ladom)/2;
        JOptionPane.showMessageDialog(null, "el area del Rombo es: " + area);


    }

}
