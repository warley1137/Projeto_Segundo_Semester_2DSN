package classes;

public class Roda extends Produto{
    private String dureza;

    public Roda(String nome, String tipoProduto, String tamanho, String cod, String descricao, String marca, String dureza, double valor) {
        super(nome, tipoProduto, tamanho, cod, descricao, marca, valor);
        this.dureza = this.dureza;
    }



    @Override
    public String mostrarProduto() {
        return super.mostrarProduto() + "\nDureza da Roda: " + this.dureza +
                "\n\n##########################################################################";
    }
}
