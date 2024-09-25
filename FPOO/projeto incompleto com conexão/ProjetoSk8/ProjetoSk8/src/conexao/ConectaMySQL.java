package conexao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNAME = "sk8toony";
    private final String URL = "jdbc:mysql://ESN509VMYSQL/" + DBNAME;
    private final String  LOGIN = "aluno";
    private final String  SENHA = "Senai1234";

    //Objeo da classe Conection que será usado para configurar
    // o IP do banco, usuário e senha //import java.sql.Connection;
    private Connection conexao;

    //   Criar um método que irá configurar o objeto conexao o método irá retornar o próprio objeto conexao, ou seja, ao final de tudo será retornado o estado da conexão, isso é, conexão aberta ou não
    public Connection iniciarConexao(){
        //Configuração do drive de banco de dados
        try {
            Class.forName(DRIVER);
            //Configuração do caminho (IP), usuário, senha e banco de dados o método getConection() tenta iniciar a conexão com os valoresPassados como parâmetro
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conexao;
    }
//    Método para desconectar do Banco
    public void close(){
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Desconectado");
    }


}
