package classes;

public class Funcionario extends Pessoa{

    public Funcionario(String nome, String enderecol, String emil, String telefone, String nueroCpf) {
        super(nome, enderecol, emil, telefone, nueroCpf);
    }

    @Override
    public String mostrarCadastro() {
        return super.mostrarCadastro() ;
    }
}
