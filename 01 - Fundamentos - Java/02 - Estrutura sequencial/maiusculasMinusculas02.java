import java.util.Scanner;

public class maiusculasMinusculas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = sc.nextLine();
        String nomeModificado = nome.toUpperCase();

        System.out.println("Você digitou assim: " + nome);
        System.out.println("");
        System.out.println("Depois de alterado: " + nomeModificado);

        
    }
}
//Também pode ser alterado para deixar as letras todas minusculas basta usar o toLowerCase.
