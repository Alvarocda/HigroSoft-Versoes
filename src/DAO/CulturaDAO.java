package DAO;

import model.EntidadeConexao;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CulturaDAO {

    EntidadeConexao conexao = new EntidadeConexao();

    public void GravaCultura(String NomeCultura, int UmidadeMinima) throws SQLException {
        try {
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "";
            stmt.executeUpdate(sql);
            conexao.Conecta().close();
        } catch (SQLException e) {
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar nova cultura", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void BuscaCulturaSelecionada() throws SQLException{
        try{
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "";
            ResultSet rset = stmt.getResultSet();
        }catch(SQLException e){
            
        }
    }
}
