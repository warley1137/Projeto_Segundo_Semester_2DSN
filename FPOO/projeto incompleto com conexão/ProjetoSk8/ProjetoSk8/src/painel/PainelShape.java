package painel;

import classes.Produto;
import classes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelShape extends JPanel {
    private JLabel jlShape, jlNome, jlCod, jlMarca, jlTamanho, jlTipoProduto, jlDescricaoLabel, jlValor, jlMadeiraLabel;
    private JTextArea jtaDescricao;
    private JTextField jtfNome, jtfCod, jtfMarca, jtfValor;
    private JRadioButton jrbShape, jrbTruck, jrbLixa, jrbRoda, jrbRolamento;
    private JRadioButton jrbTamanho1, jrbTamanho2, jrbTamanho3, jrbTamanho4, jrbTamanho5;
    private JRadioButton jrbMarfim, jrbMaple;
    private ButtonGroup bgTipoProduto, bgTamanho, bgMadeira;
    private JButton jbCadastrar;
    private List<Produto> produtos;

    public PainelShape(List<Produto> produtos) {
        this.produtos = produtos;
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        Color corDeFundoPainel = new Color(135, 206, 235);
        setBackground(corDeFundoPainel);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlShape = new JLabel("-----------------------------------------------Shape-----------------------------------------------");
        jlNome = new JLabel("Nome");
        jlCod = new JLabel("Código");
        jlMarca = new JLabel("Marca");
        jlTamanho = new JLabel("Tamanho");
        jlTipoProduto = new JLabel("Tipo de Produto");
        jlDescricaoLabel = new JLabel("Descrição");
        jlValor = new JLabel("Valor");
        jlMadeiraLabel = new JLabel("Madeira");

        jtfNome = new JTextField();
        jtfCod = new JTextField();
        jtfMarca = new JTextField();
        jtfValor = new JTextField();

        jbCadastrar = new JButton("CADASTRAR");

        jtaDescricao = new JTextArea();
        jtaDescricao.setLineWrap(true);
        JScrollPane descricaoScrollPane = new JScrollPane(jtaDescricao);
        descricaoScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jrbShape = new JRadioButton("Shape", true);
        jrbShape.setOpaque(false);
        jrbTruck = new JRadioButton("Truck");
        jrbTruck.setOpaque(false);
        jrbLixa = new JRadioButton("Lixa");
        jrbLixa.setOpaque(false);
        jrbRoda = new JRadioButton("Roda");
        jrbRoda.setOpaque(false);
        jrbRolamento = new JRadioButton("Rolamento");
        jrbRolamento.setOpaque(false);

        jrbTamanho1 = new JRadioButton("7\"");
        jrbTamanho1.setOpaque(false);
        jrbTamanho2 = new JRadioButton("7.5”");
        jrbTamanho2.setOpaque(false);
        jrbTamanho3 = new JRadioButton("8\"");
        jrbTamanho3.setOpaque(false);
        jrbTamanho4 = new JRadioButton("8.25\"");
        jrbTamanho4.setOpaque(false);
        jrbTamanho5 = new JRadioButton("8.5\"");
        jrbTamanho5.setOpaque(false);

        jrbMarfim = new JRadioButton("Marfim", true);
        jrbMarfim.setOpaque(false);
        jrbMaple = new JRadioButton("Maple");
        jrbMaple.setOpaque(false);

        bgTipoProduto = new ButtonGroup();
        bgTipoProduto.add(jrbShape);
        bgTipoProduto.add(jrbTruck);
        bgTipoProduto.add(jrbLixa);
        bgTipoProduto.add(jrbRoda);
        bgTipoProduto.add(jrbRolamento);

        bgTamanho = new ButtonGroup();
        bgTamanho.add(jrbTamanho1);
        bgTamanho.add(jrbTamanho2);
        bgTamanho.add(jrbTamanho3);
        bgTamanho.add(jrbTamanho4);
        bgTamanho.add(jrbTamanho5);

        bgMadeira = new ButtonGroup();
        bgMadeira.add(jrbMarfim);
        bgMadeira.add(jrbMaple);

        add(jlShape);
        add(jlNome);
        add(jlCod);
        add(jlMarca);
        add(jlTamanho);
        add(jlTipoProduto);
        add(jlDescricaoLabel);
        add(jlValor);
        add(jlMadeiraLabel);

        add(jrbShape);
        add(jrbTruck);
        add(jrbLixa);
        add(jrbRoda);
        add(jrbRolamento);

        add(jrbTamanho1);
        add(jrbTamanho2);
        add(jrbTamanho3);
        add(jrbTamanho4);
        add(jrbTamanho5);

        add(jrbMarfim);
        add(jrbMaple);

        add(jtfNome);
        add(jtfCod);
        add(jtfMarca);
        add(jtfValor);
        add(jbCadastrar);
        add(descricaoScrollPane);

        jlShape.setBounds(100, 10, 600, 40);
        jlNome.setBounds(20, 50, 100, 20);
        jtfNome.setBounds(130, 50, 200, 20);
        jlCod.setBounds(20, 80, 100, 20);
        jtfCod.setBounds(130, 80, 200, 20);
        jlMarca.setBounds(20, 110, 100, 20);
        jtfMarca.setBounds(130, 110, 200, 20);
        jlValor.setBounds(20, 140, 100, 20);
        jtfValor.setBounds(130, 140, 200, 20);

        jlTipoProduto.setBounds(20, 170, 100, 20);
        jrbShape.setBounds(130, 170, 80, 20);
        jrbTruck.setBounds(220, 170, 80, 20);
        jrbLixa.setBounds(310, 170, 80, 20);
        jrbRoda.setBounds(400, 170, 80, 20);
        jrbRolamento.setBounds(490, 170, 100, 20);

        jlTamanho.setBounds(20, 200, 100, 20);
        jrbTamanho1.setBounds(130, 200, 80, 20);
        jrbTamanho2.setBounds(220, 200, 80, 20);
        jrbTamanho3.setBounds(310, 200, 80, 20);
        jrbTamanho4.setBounds(400, 200, 80, 20);
        jrbTamanho5.setBounds(490, 200, 80, 20);

        jlMadeiraLabel.setBounds(20, 230, 100, 20);
        jrbMarfim.setBounds(130, 230, 80, 20);
        jrbMaple.setBounds(220, 230, 80, 20);

        jlDescricaoLabel.setBounds(20, 260, 100, 20);
        descricaoScrollPane.setBounds(130, 260, 600, 200);

        jbCadastrar.setBounds(350, 470, 150, 40);
    }

    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, cod, marca, tipoProduto, tamanho, descricao, madeira;
                double valor;

                if (!jtfNome.getText().isEmpty() && !jtfCod.getText().isEmpty() && !jtfMarca.getText().isEmpty()
                        && !jtaDescricao.getText().isEmpty() && !jtfValor.getText().isEmpty()) {

                    nome = jtfNome.getText();
                    cod = jtfCod.getText();
                    marca = jtfMarca.getText();
                    descricao = jtaDescricao.getText();
                    valor = Double.parseDouble(jtfValor.getText());

                    if (jrbShape.isSelected()) {
                        tipoProduto = "Shape";
                    } else if (jrbTruck.isSelected()) {
                        tipoProduto = "Truck";
                    } else if (jrbLixa.isSelected()) {
                        tipoProduto = "Lixa";
                    } else if (jrbRoda.isSelected()) {
                        tipoProduto = "Roda";
                    } else {
                        tipoProduto = "Rolamento";
                    }

                    if (jrbTamanho1.isSelected()) {
                        tamanho = "7\"";
                    } else if (jrbTamanho2.isSelected()) {
                        tamanho = "7.5\"";
                    } else if (jrbTamanho3.isSelected()) {
                        tamanho = "8\"";
                    } else if (jrbTamanho4.isSelected()) {
                        tamanho = "8.25\"";
                    } else {
                        tamanho = "8.5\"";
                    }

                    if (jrbMarfim.isSelected()) {
                        madeira = "Marfim";
                    } else {
                        madeira = "Maple";
                    }

                    produtos.add(new Shape(nome, tipoProduto, tamanho, cod, descricao, marca, valor, madeira));

                    jtfNome.setText("");
                    jtfCod.setText("");
                    jtfMarca.setText("");
                    jtfValor.setText("");
                    jtaDescricao.setText("");
                    bgTipoProduto.clearSelection();
                    bgTamanho.clearSelection();
                    bgMadeira.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
}
