import java.util.Scanner;

public class crescente {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x > y ) {
                System.out.println("DECRECENTE!");
            }
            else{
                System.out.println("CRESCENTE!");
            }
            System.out.println("Digite outros dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
