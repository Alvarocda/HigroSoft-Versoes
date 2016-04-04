package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntidadeConexao {
    String url  = "jdbc:postgresql://localhost:5432/HigroSoft";
    String user = "postgres";
    String pass = "123";
    
    public Connection Conecta() throws SQLException{
        return DriverManager.getConnection(url,user,pass);   
    }
    
}
