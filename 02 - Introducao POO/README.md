## Programação Orientada a Objetos em Java ☕

Este módulo apresenta os conceitos fundamentais e avançados da Programação Orientada a Objetos (POO) em Java, além de recursos importantes da linguagem utilizados no desenvolvimento de aplicações reais.

O objetivo é entender como estruturar sistemas, organizar código e aplicar boas práticas para criar software escalável e de fácil manutenção.

##  POO/
├── 01-introducao
├── 02-encapsulamento
├── 03-heranca
├── 04-polimorfismo
├── 05-excecoes
├── 06-interfaces
├── 07-colecoes
├── 08-generics
├── 09-lambda


## 📘 Introdução

A Programação Orientada a Objetos é um paradigma que organiza o software em torno de objetos, que representam entidades do mundo real ou conceitos do sistema.

Cada objeto possui:

Estado → atributos (dados)

Comportamento → métodos (ações)

A POO ajuda a resolver problemas complexos dividindo o sistema em partes menores e mais organizadas.

Principais benefícios:

Melhor organização do código

Facilidade de manutenção

Reutilização

Escalabilidade

Modelagem mais próxima da realidade

## 🔧 Construtores, palavra this, sobrecarga e encapsulamento
Construtores

Construtores são métodos especiais chamados automaticamente quando um objeto é criado.

Eles são usados para garantir que o objeto já comece em um estado válido.

Exemplo:

Pessoa pessoa = new Pessoa("Marconi");

Sem construtores, os atributos poderiam ficar sem inicialização adequada.

Palavra this

this representa a instância atual da classe.

É usada para:

Diferenciar atributos de parâmetros com mesmo nome

Encadear construtores

Referenciar métodos internos

Exemplo:

this.nome = nome;
Sobrecarga (Overloading)

Permite criar múltiplas versões de um método ou construtor com parâmetros diferentes.

Isso aumenta a flexibilidade da classe.

Exemplo:

Criar objeto com nome

Criar objeto com nome e idade

Encapsulamento

Encapsular significa proteger os dados internos da classe, permitindo acesso controlado.

Boa prática:

atributos privados

acesso via métodos

Benefícios:

Evita estados inválidos

Aumenta segurança

Facilita manutenção

## 🧠 Comportamento de memória, arrays e listas
Memória em Java

Java gerencia memória automaticamente através do Garbage Collector.

Principais áreas:

Stack → chamadas de métodos e variáveis locais

Heap → objetos e estruturas dinâmicas

Entender isso ajuda a evitar erros como referências nulas.

Arrays

Coleções de tamanho fixo.

São eficientes e simples, mas pouco flexíveis.

Usados quando o tamanho é conhecido.

Listas (ArrayList)

Estruturas dinâmicas que crescem conforme necessário.

Permitem:

Inserção

Remoção

Busca

São amplamente utilizadas em sistemas reais.

## 📅 Tópicos especiais: Data e Hora

A API moderna (java.time) foi criada para resolver problemas antigos da manipulação de datas.

Características:

Imutável

Segura

Fácil de usar

Usada para:

Logs

Sistemas financeiros

Agendamentos

Auditoria

## 📦 Enumerações e composição
Enum

Representam conjuntos fixos de valores.

Evita uso de números mágicos ou strings soltas.

Torna o código mais legível e seguro.

Composição

Relacionamento onde uma classe contém outra.

Exemplo real:

Pedido contém itens

Conta bancária contém cliente

É considerada uma das formas mais importantes de modelagem.

## 🧬 Herança e polimorfismo
Herança

Permite que uma classe herde atributos e métodos de outra.

Reduz duplicação e facilita reutilização.

Deve ser usada com cuidado para evitar acoplamento excessivo.

Polimorfismo

Permite tratar diferentes objetos de forma uniforme.

Muito usado com:

Interfaces

Classes abstratas

Permite sistemas extensíveis.

## ⚠️ Tratamento de exceções

Exceções são eventos que interrompem o fluxo normal do programa.

Podem ocorrer por:

Erro de entrada

Arquivo inexistente

Falha de conexão

Divisão por zero

Tratamento adequado:

Evita crash

Melhora experiência do usuário

Facilita diagnóstico

## 📂 Trabalhando com arquivos

Permite persistir dados fora da aplicação.

Operações comuns:

Leitura

Escrita

Criação

Exclusão

Muito usado em:

Logs

Importação/exportação

Configurações

Processamento de dados

## 🔌 Interfaces

Interfaces definem contratos que classes devem seguir.

Elas promovem:

Baixo acoplamento

Flexibilidade

Arquitetura limpa

São fundamentais em:

Injeção de dependência

Testes

Frameworks

## 🧮 Generics, Set e Map
Generics

Permitem escrever código reutilizável e seguro quanto a tipos.

Evita erros em tempo de execução.

Set

Coleção que não permite duplicatas.

Usada quando precisamos garantir unicidade.

Map

Estrutura chave → valor.

Muito usada para:

Índices

Cache

Configurações

Lookup rápido

## ⚙️ Programação funcional e expressões lambda

Introduz programação declarativa.

Permite focar no "o que fazer" ao invés do "como fazer".

Principais recursos:

Streams

Lambdas

Operações em coleções

Benefícios:

Código mais limpo

Menos verboso

Melhor legibilidade