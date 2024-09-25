package classes;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String emil;
    protected String telefone;
    protected String numeroCpf;

    public Pessoa(String nome, String endereco, String emil, String telefone, String numeroCpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.emil = emil;
        this.telefone = telefone;
        this.numeroCpf = numeroCpf;
    }

    public String mostrarCadastro(){
    return "Nome: " + this.nome + "\nEndereço: " + this.endereco +
            "\nEmail: " + this.emil + "\nTelefone: " + this.telefone +
            "\nNumero CPF/CNPJ: " + this.numeroCpf;
    }

}

