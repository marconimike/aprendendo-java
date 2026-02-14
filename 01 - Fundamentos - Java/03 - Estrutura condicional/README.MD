Estrutura Condicional 🔀

A estrutura condicional permite que o programa tome decisões com base em determinadas condições.

Até agora, nossos programas executavam tudo de forma linear (estrutura sequencial).
Agora, vamos permitir que o programa escolha qual caminho seguir.

##🧠 O que é uma estrutura condicional?

É uma estrutura que executa um bloco de código somente se uma condição for verdadeira.

Ela funciona baseada em expressões booleanas:

true (verdadeiro)

false (falso)

🔹 Estrutura if

A estrutura mais simples de decisão é o if.

Sintaxe:
if (condicao) {
    // código executado se a condição for verdadeira
}

Exemplo:
public class ExemploIf {

    public static void main(String[] args) {

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }

    }
}


##📌 Se a condição for falsa, o bloco simplesmente não é executado.

🔹 Estrutura if-else

Permite executar um bloco quando a condição for verdadeira
e outro quando for falsa.

Sintaxe:
if (condicao) {
    // verdadeiro
} else {
    // falso
}

Exemplo:
public class ExemploIfElse {

    public static void main(String[] args) {

        int numero = 10;

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

    }
}

🔹 Estrutura if-else if-else

Usada quando há múltiplas condições.

Exemplo:
public class ClassificacaoNota {

    public static void main(String[] args) {

        int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bom");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprovado");
        }

    }
}


##📌 O programa executa apenas o primeiro bloco cuja condição seja verdadeira.

🔹 Operadores Relacionais

Usados para comparar valores:

Operador	Significado
==	Igual
!=	Diferente
>	Maior que
<	Menor que
>=	Maior ou igual
<=	Menor ou igual
🔹 Operadores Lógicos

Permitem combinar condições.

Operador	Significado
&&	E (AND)
`	
!	NÃO (NOT)
Exemplo:
public class ExemploOperadoresLogicos {

    public static void main(String[] args) {

        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

    }
}

🔹 Estrutura switch

O switch é usado quando temos múltiplas opções baseadas em um único valor.

Sintaxe:
switch (variavel) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código padrão
}

Exemplo:
public class ExemploSwitch {

    public static void main(String[] args) {

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}


📌 O break evita que os outros casos sejam executados.

##🧠 Exemplo completo com entrada de dados
import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número zero");
        }

        sc.close();
    }
}

