import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome1, nome2;
        int idade;
        double salario1, salario2;
        char sexo;
        
        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Digite o salário da primeira pessoa: ");
        salario1 = sc.nextDouble();
        
        System.out.print("Digite o nome da segunda pessoa: ");
        sc.nextLine(); 
        nome2 = sc.nextLine();
        System.out.print("Digite o salário da segunda pessoa: ");
        salario2 = sc.nextDouble();
        
        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        
        System.out.print("Digite um sexo (F/M): ");
        sexo = sc.next().charAt(0);
        
        System.out.println("\nSaída de Dados:");
        System.out.println("Nome 1: " + nome1);
        System.out.println("Salário 1: " + String.format("%.2f", salario1));
        System.out.println("Nome 2: " + nome2);
        System.out.println("Salário 2: " + String.format("%.2f", salario2));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        
        sc.close();
    }

}
