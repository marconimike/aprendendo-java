## 🧩 Estrutura Sequencial 

A estrutura sequencial é a forma mais simples de execução de um programa em Java.

Nela, as instruções são executadas de cima para baixo, exatamente na ordem em que foram escritas, sem desvios ou repetições.

📌 Esse é o primeiro modelo de lógica que todo programador aprende.

## 🧠 O que é uma estrutura sequencial?

Em um programa com estrutura sequencial:

O código é executado linha por linha

Não há decisões (if) nem repetições (for, while)

Cada comando é executado apenas uma vez

Exemplo do dia a dia:

Ler um valor → processar → mostrar o resultado.

🧱 Estrutura básica de um programa sequencial

Exemplo simples em Java:

public class ProgramaSequencial {

    public static void main(String[] args) {

        System.out.println("Início do programa");

        int idade = 25;
        double salario = 2500.50;

        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);

        System.out.println("Fim do programa");

    }
}


📌 Observe que o código é executado exatamente nessa ordem.

🔤 Variáveis

Variáveis são usadas para armazenar dados temporariamente durante a execução do programa.

Estrutura de uma variável:
tipo nome = valor;

Exemplos:
int idade = 30;
double altura = 1.75;
String nome = "Marconi";


📌 O tipo da variável define o que pode ser armazenado nela.

🧮 Operações básicas

Na estrutura sequencial, é comum realizar cálculos simples.

Operadores mais usados:
Operador	Descrição
+	Soma
-	Subtração
*	Multiplicação
/	Divisão
Exemplo:
int a = 10;
int b = 5;

int soma = a + b;
int subtracao = a - b;
int multiplicacao = a * b;
int divisao = a / b;

System.out.println("Soma: " + soma);
System.out.println("Subtração: " + subtracao);
System.out.println("Multiplicação: " + multiplicacao);
System.out.println("Divisão: " + divisao);

📥 Entrada de dados (Scanner)

Para tornar o programa interativo, usamos entrada de dados.

Em Java, a classe mais comum é o Scanner.

Exemplo:
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Nome informado: " + nome);
        System.out.println("Idade informada: " + idade);

        sc.close();
    }
}


📌 O Scanner lê dados digitados pelo usuário no teclado.

📤 Saída de dados

A saída de dados é feita principalmente com:

System.out.println();


Também podemos usar:

System.out.print();
System.out.printf();

Exemplo com printf:
double salario = 3500.75;

System.out.printf("Salário: %.2f%n", salario);

🧠 Exemplo completo (estrutura sequencial)
import java.util.Scanner;

public class ExemploSequencial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor B: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("Resultado da soma: " + soma);

        sc.close();
    }
}


Fluxo do programa:

Lê o valor A

Lê o valor B

Soma os valores

Exibe o resultado

## Vamos começar:

Para essa parte no início do nosso código, vamos adicionar o seguinte comando:

import java.util.Scanner;

Esse comando importa a classe Scanner do pacote java.util, permitindo que o programa leia dados de entrada do usuário. 



