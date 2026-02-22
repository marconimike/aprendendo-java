import java.util.Scanner;
import entities.Produto;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Dados do produto");
        System.out.println("Por favor insira os dados a baixo:");
        
        System.out.print("Nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Informe a quantidade que deseja adicionar");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("Dados do produto atualizado: " + produto);

        System.out.println();
        System.out.println("Informe a quantidade que deseja remover");
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);

        System.out.println();
        System.out.println();
        System.out.println("Dados do produto atualizado: " + produto);







        sc.close();
    }
}
