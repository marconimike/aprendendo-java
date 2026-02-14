
import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMaior = 0;

        System.out.println("Informe o primeiro numero: ");
        int num1 = sc.nextInt();

        if (num1 > numMaior) {
            numMaior = num1;
        }

        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num2 > numMaior) {
            numMaior = num2;
        }

        System.out.println("Informe o terceiro numero: ");
        int num3 = sc.nextInt();

        if (num3 > numMaior) {
            numMaior = num3;
        }

        System.out.println("O mair numero digitado foi: " + numMaior);


    }
    
}
// Podemos usar o código pra informa o menor número alterando o sinal > para <, como boa pratica também alterar o nome da variavel