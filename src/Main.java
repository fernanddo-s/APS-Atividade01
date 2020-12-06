import java.util.Locale;
import java.util.Scanner;
/*
 * Comandos:
 * end -> para a execucao do programa;
 * init -> inicia o ArrayList, para isso o comando recebe um inteiro como paramentro (exemplo: init 2);
 * inserir -> insere um novo produto no ArrayLista, para isso o comando recebe todos os parametros de prodduto (exemplo: inserir 1 produto01 3.5 3 10 20);
 * comprar -> compra produtos para o estoque, para isso o comando recebe como parametro o codigo que identifica o produto, e a quantidade comprada (exemplo: comprar 1 10);
 * vender -> vender produtos do estoque, para isso o comando rece como paramentro o codigo que identifica o produto e a quantidade vendida (exemplo: vender 1 10);
 * consultar -> nostra o valor de venda de um produto, para isso o comando recebe como parametro o codigo que identifica o produto (exemplo: consultar 1);
 * */
public class Main {
    public static void main(String args[]){
        Locale.setDefault(Locale.Category.FORMAT, Locale.ROOT);
        Scanner teclado = new Scanner(System.in);
        RevendaComArray r = new RevendaComArray(0);
        while (true){
            String comando = teclado.next();
            int codigo;
            String descricao;
            double valor;
            double custo;
            double lucro;
            int qtd_estoque;
            int qtd;
            switch (comando){
                case "end":
                    System.out.println("$"+comando);
                    return;
                case "init":
                    System.out.println("$"+comando);
                    qtd = teclado.nextInt();
                    r = new RevendaComArray(qtd);
                    break;

                case "inserir":
                    System.out.println("$"+comando);
                    codigo = teclado.nextInt();
                    descricao = teclado.next();
                    valor = teclado.nextFloat();
                    custo = teclado.nextFloat();
                    lucro = teclado.nextFloat();
                    qtd_estoque = teclado.nextInt();
                    r.inserirProduto(new Produto(codigo, descricao, valor, custo, lucro, qtd_estoque));
                    break;

                case "comprar":
                    System.out.println("$"+comando);
                    codigo = teclado.nextInt();
                    qtd = teclado.nextInt();
                    r.comprar(codigo, qtd);
                    break;

                case "vender":
                    System.out.println("$"+comando);
                    codigo = teclado.nextInt();
                    qtd = teclado.nextInt();
                    r.vender(codigo, qtd);
                    break;
                case "consultar":
                    System.out.println("$"+comando);
                    codigo = teclado.nextInt();
                    r.consultarPrecoVenda(codigo);
                    break;
                case "listar":
                    System.out.println("$"+comando);
                    r.listarPrecos();
                    break;
            }
        }
    }
}
