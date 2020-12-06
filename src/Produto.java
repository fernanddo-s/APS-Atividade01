public class Produto {
    private int codigo;//identificacao do produto
    private String descricao;//nome do produto
    private double valor_compra;//preco de venda
    private double custo;//preco de compra
    private double margem_lucro;//margem de lucro
    private int qtd_estoque;//quantidade em estoque

    public void compra(int qtd){
        this.qtd_estoque += qtd;
    }

    public void venda(int qtd){
        this.qtd_estoque -= qtd;
    }

    public double calcularPrecoVenda(){
        return this.valor_compra + this.custo + this.margem_lucro * (this.valor_compra + custo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorCompra() {
        return valor_compra;
    }

    public void setValorCompra(double valor) {
        this.valor_compra = valor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargemLucro() {
        return margem_lucro;
    }

    public void setMargemLucro(double lucro) {
        this.margem_lucro = lucro;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double valor, double custo, double lucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_compra = valor;
        this.custo = custo;
        this.margem_lucro = lucro;
    }

    public Produto(int codigo, String descricao, double valor, double custo, double lucro, int qtd_estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_compra = valor;
        this.custo = custo;
        this.margem_lucro = lucro;
        this.qtd_estoque = qtd_estoque;
    }
}
