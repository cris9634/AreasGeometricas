package areas;
import java.util.Scanner;
public class areaParalelogramo {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        float base,altura,area;
        System.out.println("ingrese el valor de la base");
        base=input.nextFloat();
        System.out.println("ingrese el valor de la altura");
        altura=input.nextFloat();
        System.out.println("el area del paralelogramo es: "+(base*altura));
    }
}
