import java.util.Scanner;
public class somaSubtracao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero inteiro ");
        int a = sc.nextInt();
        System.out.println("Informe o segundo numero inteiro ");
        int b = sc.nextInt();


        int resultadoSoma = a + b;
        int resultadoSubtracao = a - b;

        System.out.println("o valor " + a + " + " + b + " é igual a: " + resultadoSoma );
        System.out.println("o valor " + a + " - " + b + " igual a: " + resultadoSubtracao );
    }
}
/*Essa modificação no código, permite a interação do usuário.
O mesmo código pode usado para multiplicação e divisão é só alterar os sinais.
*/