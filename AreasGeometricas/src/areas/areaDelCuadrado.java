package areas;
import java.util.Scanner;
public class areaDelCuadrado {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        float area,lado;
        System.out.println("digite el valor de un lado:");
        lado=input.nextFloat();
        area=lado*lado;

        System.out.println("el area del cuadrado es: "+area+" centimetros");


    }
}
