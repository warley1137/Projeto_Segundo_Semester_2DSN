package painel;

import classes.Pessoa;
import classes.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelFuncionario extends JPanel {
    private JLabel jlFuncionario, jlNome, jlEndereco, jlEmail, jlTelefone, jlNumeroCpf;
    private JTextField jtfNome, jtfEndereco, jtfEmail, jtfTelefone, jtfNumeroCpf;
    private JButton jbCadastrar;

    private List<Pessoa> pessoas;

    public PainelFuncionario(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        Color corDeFundoPainel = new Color(135, 206, 235);
        setBackground(corDeFundoPainel);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlFuncionario = new JLabel("Cadastro de Funcionário");
        jlNome = new JLabel("Nome:");
        jlEndereco = new JLabel("Endereço:");
        jlEmail = new JLabel("Email:");
        jlTelefone = new JLabel("Telefone:");
        jlNumeroCpf = new JLabel("Número do CPF:");

        jtfNome = new JTextField();
        jtfEndereco = new JTextField();
        jtfEmail = new JTextField();
        jtfTelefone = new JTextField();
        jtfNumeroCpf = new JTextField();
        jbCadastrar = new JButton("CADASTRAR");

        add(jlFuncionario);
        add(jlNome);
        add(jlEndereco);
        add(jlEmail);
        add(jlTelefone);
        add(jlNumeroCpf);

        add(jtfNome);
        add(jtfEndereco);
        add(jtfEmail);
        add(jtfTelefone);
        add(jtfNumeroCpf);
        add(jbCadastrar);

        jlFuncionario.setBounds(300, 20, 200, 40);
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
        jbCadastrar.setBounds(320, 350, 150, 40);
    }

    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, endereco, email, telefone, numeroCpf;

                if (!jtfNome.getText().isEmpty() && !jtfEndereco.getText().isEmpty() &&
                        !jtfEmail.getText().isEmpty() && !jtfTelefone.getText().isEmpty() && !jtfNumeroCpf.getText().isEmpty()) {
                    nome = jtfNome.getText();
                    endereco = jtfEndereco.getText();
                    email = jtfEmail.getText();
                    telefone = jtfTelefone.getText();
                    numeroCpf = jtfNumeroCpf.getText();

                    pessoas.add(new Funcionario(nome, endereco, email, telefone, numeroCpf));

                    jtfNome.setText("");
                    jtfEndereco.setText("");
                    jtfEmail.setText("");
                    jtfTelefone.setText("");
                    jtfNumeroCpf.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
}
