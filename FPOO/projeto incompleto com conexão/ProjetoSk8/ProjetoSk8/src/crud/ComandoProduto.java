package crud;

import conexao.ConectaMySQL;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ComandoProduto {
    Connection conexao;

    public boolean inserirProduto(String nome, String marca, String tipo, String tamanho, String descricao, String preco) {
        //comando a ser executado no banco de dados
        String comando = "INSERT INTO cliente VALUES (NULL, ?, ?, ?, ?, ?, ?, NULL, NULL);";
        //conexão do banco de dados
        ConectaMySQL conecta = new ConectaMySQL();
        conexao = conecta.iniciarConexao();
        //Preparar a conexão com o comando que será executado nala

        try {
            PreparedStatement ps = conexao.prepareStatement(comando);

            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setString(3, tipo);
            ps.setString(4, tamanho);
            ps.setString(5, descricao);
            ps.setString(6, preco);

            //Execução do comando no Banco de Dados e teste do que foi retornado
            if (ps.executeUpdate() != 0) {
                //Se alterou pelo menos 1 linha, então  o INSER deu certo
                conexao.close(); //Fecha a conexõ e liber o recurso
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
    public boolean inserirProduto(String nome, String marca, String tipo, String tamanho, String descricao, String preco, String madeira, String dureza) {
        //comando a ser executado no banco de dados
        String comando = "INSERT INTO cliente VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, NULL);";
        //conexão do banco de dados
        ConectaMySQL conecta = new ConectaMySQL();
        conexao = conecta.iniciarConexao();
        //Preparar a conexão com o comando que será executado nala

        try {
            PreparedStatement ps = conexao.prepareStatement(comando);

            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setString(3, tipo);
            ps.setString(4, tamanho);
            ps.setString(5, descricao);
            ps.setString(6, preco);
            ps.setString(7, madeira);

            //Execução do comando no Banco de Dados e teste do que foi retornado
            if (ps.executeUpdate() != 0) {
                //Se alterou pelo menos 1 linha, então  o INSER deu certo
                conexao.close(); //Fecha a conexõ e liber o recurso
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
    public boolean inserirProduto(String nome, String marca, String tipo, String tamanho, String descricao, String preco, String dureza) {
        //comando a ser executado no banco de dados
        String comando = "INSERT INTO cliente VALUES (NULL, ?, ?, ?, ?, ?, ?, NULL, ?);";
        //conexão do banco de dados
        ConectaMySQL conecta = new ConectaMySQL();
        conexao = conecta.iniciarConexao();
        //Preparar a conexão com o comando que será executado nala

        try {
            PreparedStatement ps = conexao.prepareStatement(comando);

            ps.setString(1, nome);
            ps.setString(2, marca);
            ps.setString(3, tipo);
            ps.setString(4, tamanho);
            ps.setString(5, descricao);
            ps.setString(6, preco);
            ps.setString(7, dureza);

            //Execução do comando no Banco de Dados e teste do que foi retornado
            if (ps.executeUpdate() != 0) {
                //Se alterou pelo menos 1 linha, então  o INSER deu certo
                conexao.close(); //Fecha a conexõ e liber o recurso
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
    public void  pesquisaCliente (String  comando){
        //conexão do banco de dados
        conexao = new ConectaMySQL().iniciarConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(comando);
            // Para recuperar os valores que o comando SELECT vai retornar do banco de dados, devemos armazenar eles em um objeto do tipo ResultSet

            ResultSet resulltado = ps.executeQuery();
            //Percorrer os valores que o SELECT buscou

            System.out.println("Código: \tData \t\tQuantidade \tId_Cliente \tId_Produto");

            while (resulltado.next()) { //Enquanto tiver linhas na tabela

                SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
                String data = out.format(in.parse(resulltado.getDate(4). toString()));
                System.out.println(resulltado.getInt(1) + "\t" + resulltado.getString(2) + "\t\t" + resulltado.getString(3) + "\t" + data);
            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
