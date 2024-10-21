import java.util.Scanner;

public class diagonal_negativos {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N,i,j,cont;

    System.out.print("Qual a ordem da matriz? ");
    N = sc.nextInt();

    int[][] mat = new int[N][N];
    cont =0;
    for(i = 0; i < N; i++){
        for(j = 0; j < N; j++){
            System.out.print("Elemento ["+i+","+j+"]: ");
            mat[i][j] = sc.nextInt();
            if(mat[i][j] < 0){
               cont++;
            }   
        }
    }
    System.out.println("DIAGONAL PRINCIPAL: ");
    for(i = 0; i < N; i++){
        System.out.print(mat[i][i]+"  ");
    }

    System.out.println("\nQUANTIDADE DE NEGATIVOS = "+cont);
    
    sc.close();
    }
}
