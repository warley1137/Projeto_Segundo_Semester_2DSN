package classes;

public class Shape extends Produto{

    private String madeira;


    public Shape(String nome, String tipoProduto, String tamanho, String cod, String descricao, String marca, double valor, String madeira) {
        super(nome, tipoProduto, tamanho, cod, descricao, marca, valor);
        this.madeira = this.madeira;


    }
    @Override
    public String mostrarProduto() {
        return super.mostrarProduto() + "\nTipo de madeira: " + this.madeira+
                "\n\n##########################################################################";
    }
}
