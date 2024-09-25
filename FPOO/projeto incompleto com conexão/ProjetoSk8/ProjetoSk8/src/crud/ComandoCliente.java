package crud;

import conexao.ConectaMySQL;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ComandoCliente {
    Connection conexao;

    public boolean inserirCliente(String nome, String fone, String cpf, String email, String endereco, String data_nasc, String genero) {
        //comando a ser executado no banco de dados
        String comando = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?);";
        //conexão do banco de dados
        ConectaMySQL conecta = new ConectaMySQL();
        conexao = conecta.iniciarConexao();
        //Preparar a conexão com o comando que será executado nala

        try {
            PreparedStatement ps = conexao.prepareStatement(comando);
            //tratando a variavel data de nacimento
            java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date data = null;
            data = format.parse(data_nasc);
            long millis = data.getTime(); //pegando a data em milisegundos (tipo long)
            Date sqllDate = new Date(millis); //O construtor Date passa um valor long

            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, cpf);
            ps.setString(4, email);
            ps.setString(5, endereco);
            ps.setDate(6, sqllDate);
            ps.setString(7, genero);

            //Execução do comando no Banco de Dados e teste do que foi retornado
            if (ps.executeUpdate() != 0) {
                //Se alterou pelo menos 1 linha, então  o INSER deu certo
                conexao.close(); //Fecha a conexõ e liber o recurso
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
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

                System.out.println(); //Imprime uma linha em branco
            }




        } catch (SQLException e){
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void deletarCliente (String comando){

    }
}