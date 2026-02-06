#Introdução à Linguagem Java ☕

## 📜 Um pouco da história do Java (breve resumo)

Java é uma linguagem de programação criada em 1995, pela empresa Sun Microsystems, liderada por James Gosling.
Seu principal objetivo era permitir que programas fossem executados em diferentes sistemas operacionais sem a necessidade de reescrever o código.

Daí nasceu o famoso conceito:

“Write Once, Run Anywhere”
(Escreva uma vez, execute em qualquer lugar)

Em 2010, a Sun Microsystems foi adquirida pela Oracle, que atualmente é a responsável pela evolução e manutenção da linguagem Java.

Hoje, Java é amplamente utilizado em:

Sistemas corporativos

Backend de aplicações web

Sistemas bancários

APIs

Aplicações desktop

Android (principalmente em versões mais antigas)

Java é conhecida por ser:

Robusta

Segura

Muito utilizada no mercado de trabalho

##☕  JDK, JVM e JRE: o que são?

Para entender como Java funciona, é importante conhecer esses três conceitos:

🔹 JVM (Java Virtual Machine)

A JVM é a máquina virtual responsável por executar os programas Java.

Ela:

Não executa o código Java diretamente

Executa o bytecode (.class)

Garante que o mesmo programa funcione em diferentes sistemas operacionais

Cada sistema operacional possui sua própria JVM.

🔹 JRE (Java Runtime Environment)

A JRE é o ambiente necessário apenas para executar aplicações Java.

Ela contém:

JVM

Bibliotecas padrão do Java

👉 Usada por quem só vai rodar aplicações, não desenvolver.

🔹 JDK (Java Development Kit)

O JDK é o pacote completo para desenvolvimento em Java.

Inclui:

JRE

Compilador (javac)

Ferramentas de desenvolvimento

Bibliotecas

## 📌  Para programar em Java, você precisa do JDK.

🔁 Resumindo:

JVM → executa o programa

JRE → ambiente de execução

JDK → ambiente de desenvolvimento

## 🧱  Estrutura de uma aplicação Java

Todo programa Java começa com uma classe e um método principal chamado main.

Exemplo básico:

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }

}

🔍 Entendendo cada parte:

public class HelloWorld
Define uma classe chamada HelloWorld
📌 O nome da classe deve ser o mesmo nome do arquivo (HelloWorld.java)

public static void main(String[] args)
Método principal, ponto de entrada da aplicação Java
Sem ele, o programa não executa

System.out.println()
Comando usado para imprimir mensagens no console

## ⚙️  Como o código Java é executado?

O desenvolvedor escreve o código (.java)

O compilador (javac) converte em bytecode (.class)

A JVM executa o bytecode

Esse processo garante a portabilidade do Java.

## 🛠️ Instalação da JDK
1️⃣ Baixar o JDK

Recomenda-se instalar uma versão LTS (Long Term Support), como:

Java 8 LTS Apesar de antigo, continua recebendo suporte, com previsão de atualizações até 2030.

Java 11 LTS Versão mais antiga ainda com suporte, mas a migração para 17 ou 21 é recomendada.

Java 17 LTS Lançado em 2021, é uma opção muito estável e amplamente utilizada, com suporte garantido por empresas como a Oracle e Azul Systems.

Java 21 LTS Lançado em setembro de 2023, é uma das versões mais atuais e recomendadas, com suporte planejado até pelo menos 2026/2028.

Java 25 LTS O JDK 25 é a versão mais recente com suporte de longo prazo (LTS) da plataforma Java SE. O JDK 21 é a versão anterior com suporte de longo prazo (LTS) da plataforma Java SE. Versões anteriores do JDK

Você pode baixar pelo site oficial da Oracle ou usar distribuições como: https://www.oracle.com/br/java/technologies/downloads/


Após instalar, verifique no terminal:

java -version
javac -version

## 💻 Instalação da IDE

Uma IDE facilita muito o desenvolvimento em Java.

IDEs recomendadas:

IntelliJ IDEA (Community) 

Eclipse

NetBeans

Visual Studio Code (VS Code)

Isso não quer dizer que é obrigatório usar uma IDE para começar a programar. Você pode usar até mesmo um editor de texto simples. Um IDE vai facilitar a digitação e visualização do código.

Benefícios de usar uma IDE:

Autocomplete

Organização do código

Execução fácil do programa

Detecção de erros

## 🛠️ Instalação da JDK 
