package classes;

public class Produto {
    protected String nome;
    protected String tipoProduto;
    protected String tamanho;
    protected String cod;
    protected String descricao;
    protected String marca;
    protected double valor;



    public Produto(String nome, String tipoProduto, String tamanho, String cod, String descricao, String marca, double valor) {
        this.nome = nome;
        this.tipoProduto = tipoProduto;
        this.tamanho = tamanho;
        this.cod = cod;
        this.descricao = descricao;
        this.marca = marca;
        this.valor = valor;
        }

        public String mostrarProduto(){
        return "\n Nome do iten cadstrado: "  + this.nome + "                  Código do iten: " + this.cod+
                " \n Tipo do iten cadastrado: " + this.tipoProduto  +
                "\n Tamanho do produto: " + this.tamanho +
                "\n Marca do produto: " + this.marca +
                "\n Valor do produto: " + this.valor +
                "\n Descrição: " + this.descricao ;

    }

}
