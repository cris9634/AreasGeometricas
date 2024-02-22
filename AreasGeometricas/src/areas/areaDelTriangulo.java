package areas;
import java.util.Scanner;
public class areaDelTriangulo {
    public static void main(String[] arg){
            Scanner input=new Scanner(System.in);
            float lado1,lado2,base,altura;
            System.out.println("ingrese el valor del lado 1");
            lado1=input.nextFloat();
            System.out.println("ingrese el valor del lado 2");
            lado2=input.nextFloat();
            System.out.println("ingrese el valor de la base");
            base=input.nextFloat();
            System.out.println("ingrese el valor de la altura");
            altura=input.nextFloat();
            float area=(lado1*lado2)/2;
            System.out.println("el area del triangulo es: "+area);


    }
}
