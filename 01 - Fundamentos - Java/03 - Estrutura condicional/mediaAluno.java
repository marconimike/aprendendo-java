import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a terceira nota ");
        double nota3 = sc.nextDouble();

        double media = ((nota1 + nota2 + nota3)/3);

        if (media >= 6) {
            System.out.println("Parabéns você foi APROVADO sua media é: " + media);
        } 
        else if (media >= 4) {
            System.out.println("Você não atigiu media. Mas você pode fazer recuperação" );
            System.out.println("Sua media atual " + media);
        }
        else{
            System.out.println("Você foi REPROVADO");
        }

    }
}
