import java.util.Locale;
import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N,i;

        System.out.print("Quantos numeros voce quer digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for(i = 0;i< N; i++){
            System.out.println();
            vet[i] = sc.nextDouble();
        }

        System.out.println("\nNumeros Digitados: ");
        for (i = 0;i < N; i++){
            System.out.println(String.format("%.1f", vet[i]));
        }

        sc.close();
    }
}
