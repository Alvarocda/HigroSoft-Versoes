package DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ConsomeArduinoDAO {

    private final String Endereco = "http://192.168.0.100/";
    private double Temperatura;
    private double UmidadeAmbiente;
    private double UmidadeSolo;
    private int LogArduino;
    private int StatusConexao;

    public ConsomeArduinoDAO() throws IOException {
        this.IniciaAlimentacao();
    }

    private void IniciaAlimentacao() throws MalformedURLException, IOException {
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

    /**public String DetectaErroArduino() {
        if (this.getLogArduino() == 1) {
            return "Problemas com o DHT 22 Sensor de Temperatura";
        } else if (this.getLogArduino() == 2) {
            return "Erro no Sensor de Umidade de Solo";
        } else if (this.getLogArduino() == 0) {
            return "Leitura Realizada com Sucesso";
        }
        return "";
    }**/

    public double getTemperatura() {
        return Temperatura;
    }

    private void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    public double getUmidadeAmbiente() {
        return UmidadeAmbiente;
    }

    private void setUmidadeAmbiente(double UmidadeAmbiente) {
        this.UmidadeAmbiente = UmidadeAmbiente;
    }

    public double getUmidadeSolo() {
        return UmidadeSolo;
    }

    private void setUmidadeSolo(double UmidadeSolo) {
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
    
}
