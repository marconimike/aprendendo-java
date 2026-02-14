import java.util.Scanner;

public class imparPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o número desejado ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("o numero " + num + " é Par");
        } 
        else {
            System.out.println("o numero " + num + " é Impar");
        }

    }
}

// Assim usando o mod representado pelo %, mostra o resto da divisão