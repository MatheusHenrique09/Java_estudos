import java.util.Locale;
import java.util.Scanner;

public class soma_impares {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x,y,troca,somaI;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if(y < x){
            troca = x;
            x = y;
            y = troca;
        }

        somaI = 0;

        for(int i = x+1; i < y; i++ ){
            if(i % 2 != 0){
                somaI+=i; 
            }
        }

        System.out.print("SOMA DOS IMPARES = "+somaI);
        sc.close();
    }
    
}
