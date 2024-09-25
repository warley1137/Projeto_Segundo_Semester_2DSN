package painel;

import classes.Produto;
import classes.Shape;
import classes.Truck;
import classes.Lixa;
import classes.Roda;
import classes.Rolamento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PainelMostrarDadosSk8 extends JPanel {
    private JButton jbShape, jbTruck, jbLixa, jbRoda, jbRolamento;
    private JTextArea jtaMostrar;
    private JScrollPane jsMostrar;
    private List<Produto> produtos = null;

    public PainelMostrarDadosSk8(List<Produto> produtos) {
        super();
        setPreferredSize(new Dimension(800, 600));
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        Color corDeFundoPainel = new Color(144, 238, 144);
        setBackground(corDeFundoPainel);
        this.produtos = produtos;
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jbShape = new JButton("Shape");
        jbTruck = new JButton("Truck");
        jbLixa = new JButton("Lixa");
        jbRoda = new JButton("Roda");
        jbRolamento = new JButton("Rolamento");
        jtaMostrar = new JTextArea(40, 50); // Defina as dimensões desejadas para a JTextArea
        jtaMostrar.setWrapStyleWord(true);
        jtaMostrar.setLineWrap(true);
        jsMostrar = new JScrollPane(jtaMostrar);

        add(jbShape);
        add(jbTruck);
        add(jbLixa);
        add(jbRoda);
        add(jbRolamento);
        add(jsMostrar);
    }

    private void criarEventos() {
        jbShape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("**************************CADASTROS DE SHAPES*****************************\n");

                for (Produto produto : produtos) {
                    if (produto instanceof Shape) {
                        jtaMostrar.append(produto.mostrarProduto() + "\n");
                    }
                }
            }
        });

        jbTruck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("*******************************CADASTROS DE TRUCKS**********************************\n");

                for (Produto produto : produtos) {
                    if (produto instanceof Truck) {
                        jtaMostrar.append(produto.mostrarProduto() + "\n");
                    }
                }
            }
        });

        jbLixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("**************************CADASTROS DE LIXAS*****************************\n");

                for (Produto produto : produtos) {
                    if (produto instanceof Lixa) {
                        jtaMostrar.append(produto.mostrarProduto() + "\n");
                    }
                }
            }
        });

        jbRoda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("**************************CADASTROS DE RODAS*****************************\n");

                for (Produto produto : produtos) {
                    if (produto instanceof Roda) {
                        jtaMostrar.append(produto.mostrarProduto() + "\n");
                    }
                }
            }
        });

        jbRolamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("**************************CADASTROS DE ROLAMENTOS*****************************\n");

                for (Produto produto : produtos) {
                    if (produto instanceof Rolamento) {
                        jtaMostrar.append(produto.mostrarProduto() + "\n");
                    }
                }
            }
        });
    }
}
