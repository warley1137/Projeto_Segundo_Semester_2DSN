package telas;

import classes.Pessoa;
import classes.Produto;
import painel.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaSk8 extends JFrame {
    private JMenu jmArquivo, jmCadastro, jmMostrar, jmSobre, jmProduto;
    private JMenuItem jmiSair, jmiCliente, jmiFuncionario, jmiExibirDados, jmiShape, jmiRolamento, jmiRoda, jmiTruck, jmiLixa, jmiSobreALoja;
    private JMenuBar jmbBarra;
    private Container contentPane;

    private List<Produto> produtos = new ArrayList<>();
    private List<Pessoa> pessoas = new ArrayList();

    public TelaSk8(String title) throws HeadlessException {
        super(title);
        setSize(800, 600);
        Color corDeFundoPaine = new Color(50, 205, 50);
        getContentPane().setBackground(corDeFundoPaine);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        criarEventos();
        adicionarImagem();
    }

    private void iniciarComponentes() {
        contentPane = getContentPane();
        jmbBarra = new JMenuBar();
        jmArquivo = new JMenu("Arquivo");
        jmCadastro = new JMenu("Cadastro");
        jmMostrar = new JMenu("Mostrar");
        jmSobre = new JMenu("Sobre");
        jmiSair = new JMenuItem("Sair");
        jmProduto = new JMenu("Produto");
        jmiShape = new JMenuItem("Shape");
        jmiRolamento = new JMenuItem("Rolamento");
        jmiRoda = new JMenuItem("Roda");
        jmiTruck = new JMenuItem("Truck");
        jmiLixa = new JMenuItem("Lixa");
        jmiCliente = new JMenuItem("Cliente");
        jmiFuncionario = new JMenuItem("Funcionário");
        jmiExibirDados = new JMenuItem("Exibir Dados");
        jmiSobreALoja = new JMenuItem("Sobre a Loja");

        setJMenuBar(jmbBarra);
        jmbBarra.add(jmArquivo);
        jmbBarra.add(jmCadastro);
        jmbBarra.add(jmMostrar);
        jmbBarra.add(jmSobre);
        jmArquivo.add(jmiSair);
        jmCadastro.add(jmProduto);
        jmProduto.add(jmiShape);
        jmProduto.add(jmiRolamento);
        jmProduto.add(jmiRoda);
        jmProduto.add(jmiTruck);
        jmProduto.add(jmiLixa);
        jmCadastro.add(jmiCliente);
        jmCadastro.add(jmiFuncionario);
        jmMostrar.add(jmiExibirDados);
        jmSobre .add(jmiSobreALoja);
    }

    private void criarEventos() {
        jmiSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jmiShape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelShape shape = new PainelShape(produtos);
                contentPane.removeAll();
                contentPane.add(shape);
                contentPane.validate();
            }
        });
        jmiRolamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelRolamento rolamento = new PainelRolamento(produtos);
                contentPane.removeAll();
                contentPane.add(rolamento);
                contentPane.validate();
            }
        });
        jmiRoda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelRoda roda = new PainelRoda(produtos);
                contentPane.removeAll();
                contentPane.add(roda);
                contentPane.validate();
            }
        });
        jmiTruck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelTruck truck = new PainelTruck(produtos);
                contentPane.removeAll();
                contentPane.add(truck);
                contentPane.validate();
            }
        });
        jmiLixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelLixa lixa = new PainelLixa(produtos);
                contentPane.removeAll();
                contentPane.add(lixa);
                contentPane.validate();
            }
        });

        jmiFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelFuncionario funcionario = new PainelFuncionario(pessoas);
                contentPane.removeAll();
                contentPane.add(funcionario);
                contentPane.validate();
            }
        });
        jmiCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCliente cliente = new PainelCliente(pessoas);
                contentPane.removeAll();
                contentPane.add(cliente);
                contentPane.validate();
            }
        });

        jmiExibirDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelMostrarDadosSk8 dadosSk8 = new PainelMostrarDadosSk8(produtos);
                contentPane.removeAll();
                contentPane.add(dadosSk8);
                contentPane.validate();
            }
        });
        jmiSobreALoja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelSobre sobre = new PainelSobre();
                contentPane.removeAll();
                contentPane.add(sobre);
                contentPane.validate();
            }
        });
    }
    private void adicionarImagem() {

        ImageIcon imagemIcon = new ImageIcon(getClass().getResource("/sk.png"));
// Verifique se o recurso foi carregado corretamente

        if (imagemIcon.getImageLoadStatus() == MediaTracker.COMPLETE) {
// O recurso foi carregado com sucesso

            JLabel imagemLabel = new JLabel(imagemIcon);

            add(imagemLabel);

            imagemLabel.setBounds(50, 50, 300, 200);

        } else {
// O recurso não pôde ser carregado

            System.err.println("Não foi possível carregar a imagem.");

        }
    }
}
