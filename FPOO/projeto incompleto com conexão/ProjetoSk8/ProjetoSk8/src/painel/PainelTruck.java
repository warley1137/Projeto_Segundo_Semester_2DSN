package painel;

import classes.Produto;
import classes.Truck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelTruck extends JPanel {
    private JLabel jlNome, jlCod, jlMarca, jlTipoProduto, jlTamanho, jlDescricaoLabel, jlValor, jlTruck;
    private JTextArea jtaDescricao;
    private JTextField jtfNome, jtfCod, jtfMarca, jtfValor;
    private JRadioButton jrbShape, jrbTruck, jrbLixa, jrbRoda, jrbRolamento;
    private JRadioButton jrbGrande, jrbMedio, jrbPequeno;
    private JButton jbCadastrar;

    private ButtonGroup bgTipoProduto;
    private ButtonGroup bgTamanho;

    private List<Produto> produtos;

    public PainelTruck(List<Produto> produtos) {
        this.produtos = produtos;
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        Color corDeFundoPainel = new Color(135, 206, 235);
        setBackground(corDeFundoPainel);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlTruck = new JLabel("-----------------------------------------------Truck-----------------------------------------------");
        jlNome = new JLabel("Nome");
        jlCod = new JLabel("Código");
        jlMarca = new JLabel("Marca");
        jlTipoProduto = new JLabel("Tipo de Produto");
        jlTamanho = new JLabel("Tamanho");
        jlDescricaoLabel = new JLabel("Descrição");
        jlValor = new JLabel("Valor");

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

        jrbGrande = new JRadioButton("Grande", true);
        jrbGrande.setOpaque(false);
        jrbMedio = new JRadioButton("Médio");
        jrbMedio.setOpaque(false);
        jrbPequeno = new JRadioButton("Pequeno");
        jrbPequeno.setOpaque(false);

        bgTipoProduto = new ButtonGroup();
        bgTipoProduto.add(jrbShape);
        bgTipoProduto.add(jrbTruck);
        bgTipoProduto.add(jrbLixa);
        bgTipoProduto.add(jrbRoda);
        bgTipoProduto.add(jrbRolamento);

        bgTamanho = new ButtonGroup();
        bgTamanho.add(jrbGrande);
        bgTamanho.add(jrbMedio);
        bgTamanho.add(jrbPequeno);

        add(jlTruck);
        add(jlNome);
        add(jlCod);
        add(jlMarca);
        add(jlTipoProduto);
        add(jlTamanho);
        add(jlDescricaoLabel);
        add(jlValor);

        add(jtfNome);
        add(jtfCod);
        add(jtfMarca);
        add(jtfValor);
        add(jbCadastrar);
        add(descricaoScrollPane);

        add(jrbShape);
        add(jrbTruck);
        add(jrbLixa);
        add(jrbRoda);
        add(jrbRolamento);

        add(jrbGrande);
        add(jrbMedio);
        add(jrbPequeno);

        jlTruck.setBounds(100, 10, 600, 40);
        jlNome.setBounds(20, 60, 100, 20);
        jtfNome.setBounds(130, 60, 200, 20);
        jlCod.setBounds(20, 90, 100, 20);
        jtfCod.setBounds(130, 90, 200, 20);
        jlMarca.setBounds(20, 120, 100, 20);
        jtfMarca.setBounds(130, 120, 200, 20);
        jlValor.setBounds(20, 150, 100, 20);
        jtfValor.setBounds(130, 150, 200, 20);

        jlTipoProduto.setBounds(20, 180, 100, 20);
        jrbShape.setBounds(130, 180, 80, 20);
        jrbTruck.setBounds(220, 180, 80, 20);
        jrbLixa.setBounds(310, 180, 80, 20);
        jrbRoda.setBounds(400, 180, 80, 20);
        jrbRolamento.setBounds(490, 180, 100, 20);

        jlTamanho.setBounds(20, 210, 100, 20);
        jrbGrande.setBounds(130, 210, 80, 20);
        jrbMedio.setBounds(220, 210, 80, 20);
        jrbPequeno.setBounds(310, 210, 80, 20);

        jlDescricaoLabel.setBounds(20, 240, 100, 20);
        descricaoScrollPane.setBounds(130, 240, 600, 150);

        jbCadastrar.setBounds(350, 400, 150, 40);
    }

    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, cod, marca, tipoProduto, tamanho, descricao;
                double valor;

                if (!jtfNome.getText().isEmpty() && !jtfCod.getText().isEmpty() && !jtfMarca.getText().isEmpty() && !jtfValor.getText().isEmpty() && !jtaDescricao.getText().isEmpty()) {
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

                    if (jrbGrande.isSelected()) {
                        tamanho = "Grande";
                    } else if (jrbMedio.isSelected()) {
                        tamanho = "Médio";
                    } else {
                        tamanho = "Pequeno";
                    }

                    produtos.add(new Truck(nome, tipoProduto, tamanho, cod, descricao, marca, valor));

                    jtfNome.setText("");
                    jtfCod.setText("");
                    jtfMarca.setText("");
                    jtfValor.setText("");
                    jtaDescricao.setText("");
                    bgTipoProduto.clearSelection();
                    bgTamanho.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
}
