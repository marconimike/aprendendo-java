
import java.util.Scanner;

public class imprimirPalavraDezVezes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a palavra que deseja repetir: ");
        String palavra = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // essa linha vai mostrar o número de repetições
            System.out.println(palavra);

        }
    
    }
    
}
