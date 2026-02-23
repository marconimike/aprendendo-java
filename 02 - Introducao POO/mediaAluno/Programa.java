import java.util.Scanner;

import entities.Aluno;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        

        System.out.println("Bem-vindo ao sistema de calculo de media");
        System.out.print("Informe seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.println();

        System.out.print("Informe seu curso: ");
        aluno.curso = sc.nextLine();
        System.out.println();

        System.out.println("Olá " + aluno.nome +" Espero que esteja passando bem");
        System.out.print("Informe sua 1 nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println();

        System.out.print("Informe sua 2 nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println();

        System.out.print("Informe sua 3 nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.println();

        //System.out.println("Sua media: " + aluno.media());
        System.out.println(aluno.resultado());




        sc.close();

    }

}
