package DAO;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class ConsomeArduinoDAO {

    private final String Endereco = "http://187.28.205.178";
    private int Temperatura;
    private int UmidadeAmbiente;
    private int UmidadeSolo;
    private int LogArduino;
    private int StatusConexao;
    private int statusBombaAgua;
    private int statusBombaFert;

    

    public ConsomeArduinoDAO() throws IOException {
        this.leJson();
    }
    public void leJson() throws MalformedURLException, IOException{
        try{
        JsonParser parser = new JsonParser();
        URL endereco = new URL(Endereco+":85/Higrosoft/lista");
        URLConnection conn = endereco.openConnection();
        BufferedReader leitor = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String valorEntrada;
        while((valorEntrada = leitor.readLine()) != null){            
            JsonObject json = (JsonObject) parser.parse(valorEntrada);
            setTemperatura(json.get("Temperatura").getAsInt());
            setUmidadeAmbiente(json.get("UmidadeDoAr").getAsInt());
            setUmidadeSolo(json.get("UmidadeDoSolo").getAsInt());
            setLogArduino(json.get("Logs").getAsInt());
            setStatusBombaAgua(json.get("StatusAgua").getAsInt());
            setStatusBombaFert(json.get("StatusAdubo").getAsInt());
            setStatus(1);
        }
        }catch(MalformedURLException e){
            setStatus(2);
        }catch(IOException e){
            setStatus(2);
        }
    }
    
    
    
    
    
    
    //METODO ABAIXO LÊ XML
    /**private void IniciaAlimentacao() throws MalformedURLException, IOException {
        try {
            URL endereco = new URL(this.Endereco + "Sensores");
            URLConnection conn = endereco.openConnection();
            try (BufferedReader xml = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()))) {
                try {
                    xml.readLine();
                    xml.readLine();
                    xml.readLine();
                    this.setTemperatura(parseDouble(xml.readLine()));
                    xml.readLine();
                    xml.readLine();
                    this.setUmidadeAmbiente(parseDouble(xml.readLine()));
                    xml.readLine();
                    xml.readLine();
                    this.setUmidadeSolo(parseDouble(xml.readLine()));
                    xml.readLine();
                    xml.readLine();
                    this.setLogArduino(parseInt(xml.readLine()));
                    this.setStatus(1);
                } catch (Exception ex) {

                }
            }
        } catch (MalformedURLException e) {
            this.setStatus(2);
            //JOptionPane.showMessageDialog(null, "Erro ao conectar-se com o Arduino");

        } catch (IOException e) {
            this.setStatus(2);
            //JOptionPane.showMessageDialog(null, "Erro ao conectar-se com o Arduino");

        }

    }
    **/
    
    public double getTemperatura() {
        return Temperatura;
    }

    private void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public double getUmidadeAmbiente() {
        return UmidadeAmbiente;
    }

    private void setUmidadeAmbiente(int UmidadeAmbiente) {
        this.UmidadeAmbiente = UmidadeAmbiente;
    }

    public double getUmidadeSolo() {
        return UmidadeSolo;
    }

    private void setUmidadeSolo(int UmidadeSolo) {
        this.UmidadeSolo = UmidadeSolo;
        if(this.UmidadeSolo > 100){
            this.UmidadeSolo = 100;
        }
    }

    public int getLogArduino() {
        return LogArduino;
        
    }

    private void setLogArduino(int LogArduino) {
        this.LogArduino = LogArduino;
        
    }

    public void setStatus(int Status) {
        this.StatusConexao = Status;
        
    }

    public int getStatus() {
        return this.StatusConexao;
        
    }
    public int getStatusBombaFert() {
        return statusBombaFert;
    }

    public void setStatusBombaFert(int statusBombaFert) {
        this.statusBombaFert = statusBombaFert;
    }

    public int getStatusBombaAgua() {
        return statusBombaAgua;
    }

    public void setStatusBombaAgua(int statusBombas) {
        this.statusBombaAgua = statusBombas;
    }
    
}
