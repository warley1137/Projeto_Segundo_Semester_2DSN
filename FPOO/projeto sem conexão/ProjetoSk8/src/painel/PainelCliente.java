package painel;

import classes.Cliente;
import classes.Pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelCliente extends JPanel {
    private JLabel jlCliente, jlNome, jlEndereco, jlEmail, jlTelefone, jlNumeroCpf, jlGenero;
    private JTextField jtfNome, jtfEndereco, jtfEmail, jtfTelefone, jtfNumeroCpf;
    private JRadioButton jrbMasculino, jrbFeminino, jrbOutro;
    private ButtonGroup bgGenero;
    private JButton jbCadastrar;



    private List<Pessoa> pessoas;

    public PainelCliente(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        Color corDeFundoPainel = new Color(135, 206, 235);
        setBackground(corDeFundoPainel);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlCliente = new JLabel("Cadastro de Cliente");
        jlNome = new JLabel("Nome:");
        jlEndereco = new JLabel("Endereço:");
        jlEmail = new JLabel("Email:");
        jlTelefone = new JLabel("Telefone:");
        jlNumeroCpf = new JLabel("Número do CPF:");
        jlGenero = new JLabel("Gênero:");

        jtfNome = new JTextField();
        jtfEndereco = new JTextField();
        jtfEmail = new JTextField();
        jtfTelefone = new JTextField();
        jtfNumeroCpf = new JTextField();

        jrbMasculino = new JRadioButton("Masculino");
        jrbFeminino = new JRadioButton("Feminino");
        jrbOutro = new JRadioButton("Outro");

        jrbMasculino.setOpaque(false);
        jrbFeminino.setOpaque(false);
        jrbOutro.setOpaque(false);

        bgGenero = new ButtonGroup();
        bgGenero.add(jrbMasculino);
        bgGenero.add(jrbFeminino);
        bgGenero.add(jrbOutro);

        jbCadastrar = new JButton("CADASTRAR");

        add(jlCliente);
        add(jlNome);
        add(jlEndereco);
        add(jlEmail);
        add(jlTelefone);
        add(jlNumeroCpf);
        add(jlGenero);

        add(jtfNome);
        add(jtfEndereco);
        add(jtfEmail);
        add(jtfTelefone);
        add(jtfNumeroCpf);
        add(jrbMasculino);
        add(jrbFeminino);
        add(jrbOutro);
        add(jbCadastrar);

        jlCliente.setBounds(300, 20, 200, 40);
        jlNome.setBounds(100, 100, 100, 20);
        jtfNome.setBounds(220, 100, 400, 30);
        jlEndereco.setBounds(100, 150, 100, 20);
        jtfEndereco.setBounds(220, 150, 400, 30);
        jlEmail.setBounds(100, 200, 100, 20);
        jtfEmail.setBounds(220, 200, 400, 30);
        jlTelefone.setBounds(100, 250, 100, 20);
        jtfTelefone.setBounds(220, 250, 400, 30);
        jlNumeroCpf.setBounds(100, 300, 100, 20);
        jtfNumeroCpf.setBounds(220, 300, 400, 30);

        jlGenero.setBounds(100, 350, 100, 20);
        jrbMasculino.setBounds(220, 350, 100, 20);
        jrbFeminino.setBounds(320, 350, 100, 20);
        jrbOutro.setBounds(420, 350, 100, 20);

        jbCadastrar.setBounds(320, 400, 150, 40);
    }

    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, endereco, email, telefone, numeroCpf, genero;

                if (!jtfNome.getText().isEmpty() && !jtfEndereco.getText().isEmpty() &&
                        !jtfEmail.getText().isEmpty() && !jtfTelefone.getText().isEmpty() && !jtfNumeroCpf.getText().isEmpty()) {
                    nome = jtfNome.getText();
                    endereco = jtfEndereco.getText();
                    email = jtfEmail.getText();
                    telefone = jtfTelefone.getText();
                    numeroCpf = jtfNumeroCpf.getText();

                    if (jrbMasculino.isSelected()) {
                        genero = "Masculino";
                    } else if (jrbFeminino.isSelected()) {
                        genero = "Feminino";
                    } else {
                        genero = "Outro";
                    }

                    pessoas.add(new Cliente(nome, endereco, email, telefone, numeroCpf, genero));

                    jtfNome.setText("");
                    jtfEndereco.setText("");
                    jtfEmail.setText("");
                    jtfTelefone.setText("");
                    jtfNumeroCpf.setText("");
                    bgGenero.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
}
