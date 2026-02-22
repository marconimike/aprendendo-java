Estruturas Repetitivas 🔁

As estruturas repetitivas (ou laços de repetição) permitem executar um bloco de código várias vezes, enquanto uma condição for verdadeira.

Elas evitam repetição manual de código e tornam o programa muito mais eficiente.

## 🧠 Por que usar repetição?

Imagine que você precise imprimir números de 1 a 100.

Sem repetição, você teria que escrever 100 linhas de código.

Com repetição, basta um pequeno bloco.

🔹 Estrutura while

O while executa o bloco de código enquanto a condição for verdadeira.

Sintaxe:
while (condicao) {
    // código a ser repetido
}

Exemplo:
public class ExemploWhile {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }

    }
}


## 📌 O incremento (contador++) é essencial para evitar loop infinito.

🔹 Estrutura do-while

O do-while executa o bloco pelo menos uma vez,
mesmo que a condição seja falsa.

Sintaxe:
do {
    // código
} while (condicao);

Exemplo:
public class ExemploDoWhile {

    public static void main(String[] args) {

        int numero = 1;

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);

    }
}


## 📌 A diferença é que a condição é verificada depois da execução.

🔹 Estrutura for

O for é ideal quando sabemos quantas vezes queremos repetir.

Sintaxe:
for (inicializacao; condicao; incremento) {
    // código
}

Exemplo:
public class ExemploFor {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

    }
}


🔎 Estrutura do for:

Inicialização → executada uma única vez

Condição → verificada antes de cada repetição

Incremento → executado após cada ciclo

🔹 Comparação entre while e for
Situação	Melhor usar
Número de repetições conhecido	for
Número de repetições desconhecido	while
Executar pelo menos uma vez	do-while
🔹 Exemplo prático com entrada de dados
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

🔹 Loop infinito ⚠️

Um loop infinito acontece quando a condição nunca se torna falsa.

Exemplo perigoso:

while (true) {
    System.out.println("Loop infinito");
}


## 📌 Sempre garanta que exista uma condição de parada.

🔹 Comandos break e continue
break

Interrompe completamente o loop.

for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}

continue

Pula a iteração atual.

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}

🧠 Exemplo completo
import java.util.Scanner;

public class SomaAteZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números (0 para parar):");

        do {
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}