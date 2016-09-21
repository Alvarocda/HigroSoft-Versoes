package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.EntidadeConexao;
import view.AutenticaLogin;
import view.Principal;
import view.RegistroUsuario;

public class UsuarioDAO extends EntidadeConexao{
      
    public void Autenticacao(String Email, String Senha) throws SQLException {
        Connection conexao = Conecta();
        Statement stmt = conexao.createStatement();
        String sql = "SELECT * FROM usuario WHERE email ='" + Email + "' AND senha ='" + Senha + "'";
        stmt.execute(sql);
        ResultSet rs = stmt.getResultSet();        
        if (rs.next() == true) {
            conexao.close();
            new Principal().setVisible(true);
        } else {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuário e Senha invalida");
            new AutenticaLogin().setVisible(true);            
        }
    }
    
    public void CriaNovoUsuario(String Email, String Senha)throws SQLException {        
        Connection conexao = Conecta();
        try{            
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO usuario(email,senha) VALUES ('"+Email+"','"+Senha+"')";
            stmt.executeUpdate(sql);
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuario registrado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Usuario ja existente");
            conexao.close();
            new RegistroUsuario().setVisible(true);
        }
    }
}
