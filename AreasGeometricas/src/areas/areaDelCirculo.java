package areas;
import java.util.Scanner;

public class areaDelCirculo {

    public static void main(String [] arg){
        Scanner input=new Scanner(System.in);
        float radio;
        double area;
        System.out.println("ingrese el valor del radio ");
        radio=input.nextFloat();
        area = (3.14)*Math.pow(radio,2);
        System.out.println(("el valor del area es: ")+area);


    }


}
