import java.util.Scanner;
import java.util.Locale;

public class retangulo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        altura = sc.nextDouble();

        area = altura * base;
        perimetro = 2 * (altura + base);
        diagonal = Math.sqrt(Math.pow(altura,2.0) + base * base);

        System.out.println("Área = " + String.format("%.4f", area));
        System.out.println("Perímetro = " + String.format("%.4f", perimetro));
        System.out.println("Diagonal = " + String.format("%.4f", diagonal));

        sc.close();
    }
}
