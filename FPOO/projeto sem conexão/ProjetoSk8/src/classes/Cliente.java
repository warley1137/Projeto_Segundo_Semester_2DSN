package classes;

public class Cliente extends Pessoa{

    private String genero;


    public Cliente(String nome, String enderecol, String emil, String telefone, String nueroCpf, String genero) {
        super(nome, enderecol, emil, telefone, nueroCpf);
        this.genero = genero;

    }

    @Override
    public String mostrarCadastro() {
        return super.mostrarCadastro() + "\nGenero: "+ this.genero;
    }
}
