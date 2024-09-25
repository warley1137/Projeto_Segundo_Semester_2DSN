package classes;

public class Rolamento extends Produto {

    public Rolamento(String nome, String tipoProduto, String tamanho, String cod, String descricao, String marca, double valor) {
        super(nome, tipoProduto, tamanho, cod, descricao, marca, valor);
    }

    @Override
    public String mostrarProduto() {
        return super.mostrarProduto()+
                "\n\n##########################################################################";
    }
}
