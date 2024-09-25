package painel;

import classes.Produto;
import classes.Roda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelRoda extends JPanel {
    private JLabel jlNome, jlCod, jlMarca, jlTipoProduto, jlTamanho, jlDescricaoLabel, jlDureza, jlValor, jlRoda;
    private JTextArea jtaDescricao;
    private JTextField jtfNome, jtfCod, jtfMarca, jtfValor;
    private JButton jbCadastrar;

    private JRadioButton jrbShape, jrbTruck, jrbLixa, jrbRoda, jrbRolamento;
    private JRadioButton jrb75A, jrb85A, jrb90A, jrb95A, jrb100A, jrb102A;
    private JRadioButton jrb48mm, jrb52mm, jrb56mm, jrb60mm;

    private ButtonGroup bgTipoProduto;
    private ButtonGroup bgDureza;
    private ButtonGroup bgTamanho;

    private List<Produto> produtos;

    public PainelRoda(List<Produto> produtos) {
        this.produtos = produtos;
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        Color corDeFundoPainel = new Color(135, 206, 235);
        setBackground(corDeFundoPainel);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlNome = new JLabel("Nome");
        jlCod = new JLabel("Código");
        jlMarca = new JLabel("Marca");
        jlTipoProduto = new JLabel("Tipo de Produto");
        jlTamanho = new JLabel("Tamanho");
        jlDescricaoLabel = new JLabel("Descrição");
        jlDureza = new JLabel("Dureza");
        jlValor = new JLabel("Valor");
        jlRoda = new JLabel("-----------------------------------------------Roda-----------------------------------------------");

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

        jrb75A = new JRadioButton("75A");
        jrb75A.setOpaque(false);
        jrb85A = new JRadioButton("85A");
        jrb85A.setOpaque(false);
        jrb90A = new JRadioButton("90A");
        jrb90A.setOpaque(false);
        jrb95A = new JRadioButton("95A");
        jrb95A.setOpaque(false);
        jrb100A = new JRadioButton("100A");
        jrb100A.setOpaque(false);
        jrb102A = new JRadioButton("102A");
        jrb102A.setOpaque(false);

        jrb48mm = new JRadioButton("48mm");
        jrb48mm.setOpaque(false);
        jrb52mm = new JRadioButton("52mm");
        jrb52mm.setOpaque(false);
        jrb56mm = new JRadioButton("56mm");
        jrb56mm.setOpaque(false);
        jrb60mm = new JRadioButton("60mm");
        jrb60mm.setOpaque(false);

        bgTipoProduto = new ButtonGroup();
        bgTipoProduto.add(jrbShape);
        bgTipoProduto.add(jrbTruck);
        bgTipoProduto.add(jrbLixa);
        bgTipoProduto.add(jrbRoda);
        bgTipoProduto.add(jrbRolamento);

        bgDureza = new ButtonGroup();
        bgDureza.add(jrb75A);
        bgDureza.add(jrb85A);
        bgDureza.add(jrb90A);
        bgDureza.add(jrb95A);
        bgDureza.add(jrb100A);
        bgDureza.add(jrb102A);

        bgTamanho = new ButtonGroup();
        bgTamanho.add(jrb48mm);
        bgTamanho.add(jrb52mm);
        bgTamanho.add(jrb56mm);
        bgTamanho.add(jrb60mm);

        add(jlRoda);
        add(jlNome);
        add(jlCod);
        add(jlMarca);
        add(jlTipoProduto);
        add(jlTamanho);
        add(jlDescricaoLabel);
        add(jlDureza);
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

        add(jrb75A);
        add(jrb85A);
        add(jrb90A);
        add(jrb95A);
        add(jrb100A);
        add(jrb102A);

        add(jrb48mm);
        add(jrb52mm);
        add(jrb56mm);
        add(jrb60mm);

        jlRoda.setBounds(100, 10, 600, 40);
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
        jrb48mm.setBounds(130, 210, 80, 20);
        jrb52mm.setBounds(220, 210, 80, 20);
        jrb56mm.setBounds(310, 210, 80, 20);
        jrb60mm.setBounds(400, 210, 80, 20);

        jlDureza.setBounds(20, 240, 100, 20);
        jrb75A.setBounds(130, 240, 80, 20);
        jrb85A.setBounds(220, 240, 80, 20);
        jrb90A.setBounds(310, 240, 80, 20);
        jrb95A.setBounds(400, 240, 80, 20);
        jrb100A.setBounds(490, 240, 80, 20);
        jrb102A.setBounds(580, 240, 80, 20);

        jlDescricaoLabel.setBounds(20, 270, 100, 20);
        descricaoScrollPane.setBounds(130, 270, 600, 100);

        jbCadastrar.setBounds(350, 390, 150, 40);
    }

    private void criarEventos() {
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, cod, marca, tipoProduto, tamanho, descricao, dureza;
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

                    if (jrb48mm.isSelected()) {
                        tamanho = "48mm";
                    } else if (jrb52mm.isSelected()) {
                        tamanho = "52mm";
                    } else if (jrb56mm.isSelected()) {
                        tamanho = "56mm";
                    } else {
                        tamanho = "60mm";
                    }

                    if (jrb75A.isSelected()) {
                        dureza = "75A";
                    } else if (jrb85A.isSelected()) {
                        dureza = "85A";
                    } else if (jrb90A.isSelected()) {
                        dureza = "90A";
                    } else if (jrb95A.isSelected()) {
                        dureza = "95A";
                    } else if (jrb100A.isSelected()) {
                        dureza = "100A";
                    } else {
                        dureza = "102A";
                    }

                    produtos.add(new Roda(nome, tipoProduto, tamanho, cod, descricao, marca, dureza, valor));



                    jtfNome.setText("");
                    jtfCod.setText("");
                    jtfMarca.setText("");
                    jtfValor.setText("");
                    jtaDescricao.setText("");
                    bgTipoProduto.clearSelection();
                    bgTamanho.clearSelection();
                    bgDureza.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
    }
}
