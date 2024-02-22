package areas;
import java.util.Scanner;
public class areaTrapecio {
    public static void main(String[] arg){
        Scanner Trapecio = new Scanner (System.in);
        System.out.println("Ingresar parte inferior");
        float parteInferior = Trapecio.nextFloat();
        System.out.println("Ingresar parte superior");
        float parteSuperior = Trapecio.nextFloat();
        System.out.println("Ingresar altura");
        float altura = Trapecio.nextFloat();
        float area = (parteInferior+parteSuperior)/2*altura;
        System.out.println("El area es: "+area);


    }
}
