package areas;
import javax.swing.JOptionPane;
public class areaHexagono {
    public static void main(String[] args){
    float lado, apotema, perimetro, area;

    lado = Float.parseFloat(JOptionPane.showInputDialog("digite el valor del lado = "));
    apotema = Float.parseFloat(JOptionPane.showInputDialog("digite el valor del apotema = "));
    perimetro = lado * 6;
    area = (perimetro * apotema)/2;
    JOptionPane.showMessageDialog(null, "el area del hexagono es: " + area);


    }



}
