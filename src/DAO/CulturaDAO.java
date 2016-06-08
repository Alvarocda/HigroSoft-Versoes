package DAO;

import model.EntidadeConexao;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.TelaCulturas;

public class CulturaDAO {
    private int idCulturaAgendada,diainicial,mesinicial,anoinicial,diafinal,mesfinal,anofinal,emAndamento;
    private int idCulturaAtiva,status;
    String nomeDaCulturaAtiva;
    EntidadeConexao conexao = new EntidadeConexao();

    public void GravaCultura(String NomeCultura, int UmidadeMinima,String FrequenciaAgua, String FrequenciaFertilizante,String Usuario) throws SQLException {
        try {
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "INSERT INTO culturas(nome_cultura,umidade_minima,usuario_que_adicionou,frequencia_agua,frequencia_fertilizante) VALUES('"+NomeCultura+"','"+UmidadeMinima+"','"+Usuario+"','"+FrequenciaAgua+"','"+FrequenciaFertilizante+"')";
            stmt.executeUpdate(sql);
            conexao.Conecta().close();
            new TelaCulturas().AtualizaTabela();
            JOptionPane.showMessageDialog(null,"Cultura cadastrada com sucesso!");            
        } catch (SQLException e) {
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar nova cultura"+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public DefaultTableModel AlimentaTabela() throws SQLException{
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Cultura");
        dm.addColumn("Umid. minima");
        dm.addColumn("Freq. Água");
        dm.addColumn("Freq. Fertilizante");
        String sql = "SELECT * FROM culturas";
        try{
            Statement stmt = conexao.Conecta().createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                String ID = rset.getString(1);
                String NomeCultura = rset.getString(2);
                int UmidadeMinima = rset.getInt(3);
                String FrequenciaAgua = rset.getString(5);
                String FrequenciaFertilizante = rset.getString(6);
                dm.addRow(new String[]{Integer.toString(UmidadeMinima),ID, NomeCultura,FrequenciaAgua,FrequenciaFertilizante});
            }
            conexao.Conecta().close();
            return dm;
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao popular tabela");
        }
        return null;
    }
    public void AtualizaCultura(int ID, String NomeCultura, int UmidadeMinima) throws SQLException{
        String sql = "UPDATE culturas SET nome_cultura = '"+NomeCultura+"',umidade_minima = '"+UmidadeMinima+"' WHERE id_cultura ='"+ID+"'";
        try{
            Statement stmt = conexao.Conecta().createStatement();
            stmt.execute(sql);
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Cultura atualizada com sucesso!");
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cultura\nVerifique se a mesma ja não esta cadastrada");
        }
    }
    public void DeletaCultura(int ID) throws SQLException{
        String sql = "DELETE FROM culturas where id_cultura = '"+ID+"'";
        try{
        Statement stmt = conexao.Conecta().createStatement();
        stmt.execute(sql);
        conexao.Conecta().close();
        JOptionPane.showMessageDialog(null, "Cultura deletada com sucesso!");
        }catch(SQLException e){
         conexao.Conecta().close();
         JOptionPane.showMessageDialog(null, "Erro ao deletar cultura");
        }        
    }
    public void insereAgendamento(String UsuarioQueAgendou,int id_da_cultura, int diaInicial, int mesInicial,int anoInicial, int diaFinal, int mesFinal, int anoFinal) throws SQLException{
        try{
            Statement stmt = this.conexao.Conecta().createStatement();
            String sql = "INSERT INTO agendamentos(id_cultura_agendada,dia_inicial,mes_inicial,dia_final,mes_final,usuario_que_agendou,ano_inicial,ano_final) "
                    + "VALUES('"+id_da_cultura+"','"+diaInicial+"','"+mesInicial+"','"+diaFinal+"','"+mesFinal+"','"+UsuarioQueAgendou+"','"+anoInicial+"','"+anoFinal+"')";
            stmt.executeUpdate(sql);
            this.conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Agendamento registrado com sucesso!");
        }catch(SQLException e){
            this.conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Falha ao agendar");
        }
    }
    public void retornaCulturaAtiva(){
        try{
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "SELECT id_cultura_ativa,status,nome_cultura FROM culturas,culturas_ativas WHERE id_cultura_ativa = id_cultura and status = '1'";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                idCulturaAtiva = rset.getInt(1);
                status         = rset.getInt(2);
                nomeDaCulturaAtiva  = rset.getString(3);
            }
            conexao.Conecta().close();
            System.out.println(idCulturaAtiva+"\n"+status+"\n"+nomeDaCulturaAtiva);
        }catch(SQLException e){
            
        }
    }

    public void retornaInformacoesDoAgendamento(){
        try{
            
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "SELECT id_cultura_agendada,dia_inicial,mes_inicial,ano_inicial,dia_final,mes_final,ano_final,em_andamento FROM agendamentos WHERE em_adamento= '1'";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.first()){
                idCulturaAgendada = rset.getInt(1);
                diainicial        = rset.getInt(2);
                mesinicial        = rset.getInt(3);
                anoinicial        = rset.getInt(4);
                diafinal          = rset.getInt(5);
                mesfinal          = rset.getInt(6);
                anofinal          = rset.getInt(7);
                emAndamento       = rset.getInt(8);
            }
        }catch(SQLException e){
            
        }
    }

    public int getIdCulturaAtiva() {
        return idCulturaAtiva;
    }

    public void setIdCulturaAtiva(int idCulturaAtiva) {
        this.idCulturaAtiva = idCulturaAtiva;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNomeDaCulturaAtiva() {
        return nomeDaCulturaAtiva;
    }

    public void setNomeDaCulturaAtiva(String nomeDaCulturaAtiva) {
        this.nomeDaCulturaAtiva = nomeDaCulturaAtiva;
    }
    
    public int getIdCulturaAgendada() {
        return idCulturaAgendada;
    }

    public void setIdCulturaAgendada(int idCulturaAgendada) {
        this.idCulturaAgendada = idCulturaAgendada;
    }

    public int getDiainicial() {
        return diainicial;
    }

    public void setDiainicial(int diainicial) {
        this.diainicial = diainicial;
    }

    public int getMesinicial() {
        return mesinicial;
    }

    public void setMesinicial(int mesinicial) {
        this.mesinicial = mesinicial;
    }

    public int getAnoinicial() {
        return anoinicial;
    }

    public void setAnoinicial(int anoinicial) {
        this.anoinicial = anoinicial;
    }

    public int getDiafinal() {
        return diafinal;
    }

    public void setDiafinal(int diafinal) {
        this.diafinal = diafinal;
    }

    public int getMesfinal() {
        return mesfinal;
    }

    public void setMesfinal(int mesfinal) {
        this.mesfinal = mesfinal;
    }

    public int getAnofinal() {
        return anofinal;
    }

    public void setAnofinal(int anofinal) {
        this.anofinal = anofinal;
    }

    public int getEmAndamento() {
        return emAndamento;
    }

    public void setEmAndamento(int emAndamento) {
        this.emAndamento = emAndamento;
    }

    public EntidadeConexao getConexao() {
        return conexao;
    }

    public void setConexao(EntidadeConexao conexao) {
        this.conexao = conexao;
    }
}
