import java.util.Scanner;

public class menor_de_tres {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x,y,z,menor;

        System.out.print("Primeiro valor: ");
        x = sc.nextInt();

        System.out.print("Segundo valor: ");
        y = sc.nextInt();

        System.out.print("Terceiro valor: ");
        z = sc.nextInt();

        if(x < y && x < z){
            menor = x;
            System.out.print("MENOR = "+ menor);
        }
        else if(y < z){
            menor = y;
            System.out.print("MENOR = "+ menor);
        }
        else{
            menor = z;
            System.out.println("MENOR = "+menor);
        }

        sc.close();
    }

    
}
