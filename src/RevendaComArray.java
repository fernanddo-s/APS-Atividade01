import java.util.ArrayList;

public class RevendaComArray {
    private ArrayList<Produto> produtos;
    private int indice;

    public RevendaComArray(int qtd) {
        produtos = new ArrayList<>(qtd);
    }

    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }

    public boolean comprar(int codigo, int qtd){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() == codigo){
                Produto p = produtos.get(i);
                p.setQtd_estoque(p.getQtd_estoque() + qtd);
                return true;
            }
        }
        System.out.println("erro: produto não existe");
        return false;
    }

    public boolean vender(int codigo, int qtd){
        for (int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() == codigo){
                Produto p = produtos.get(i);
                p.setQtd_estoque(p.getQtd_estoque() - qtd);
                return true;
            }
        }
        System.out.println("erro: produto não existe");
        return false;
    }

    public boolean consultarPrecoVenda(int cod){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() == cod) {
                System.out.println(produtos.get(i).getValorCompra());
                return true;
            }
        }
        System.out.println("erro: produto nao existe");
        return false;
    }

    public void listarPrecos() {
        for(int i = 0; i < this.produtos.size(); i++){
            System.out.println(produtos.get(i).getCodigo() + " " + produtos.get(i).getDescricao()+ " " +produtos.get(i).getValorCompra());
        }
    }

    public void consultarValorCompra(int codigo){
        for(int i = 0; i < this.produtos.size(); i++){
            if(this.produtos.get(i).getCodigo() == codigo){
                System.out.println(produtos.get(i).getValorCompra());
            }
        }
    }

}