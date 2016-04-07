
package DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ControleIrrigacao {

    private String Endereco = "http://192.168.0.100/";
    public void AtivaDispersao(String TipoDispersao, String AguaOuFertilizante) throws MalformedURLException, IOException{
        URL endereco = new URL(this.Endereco +  TipoDispersao+AguaOuFertilizante);
            URLConnection conn = endereco.openConnection();
            try (BufferedReader xml = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()))){                
            }
        
    }
}
