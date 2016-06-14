
package Controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class VerificaDataAtual {
    private int DiaAtual,MesAtual,AnoAtual,HoraAtual,MinutoAtual;
    public void PegaDataAtual(){
        GregorianCalendar calendario = new GregorianCalendar();
        DiaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        MesAtual = calendario.get(Calendar.MONTH);
        MesAtual = MesAtual + 1; //Segundo a documentação da classe Calendar do java, ele começa a contar os meses pelo numero 0, logo ao selecionar o mês de janeiro, ele retornava o numero 0
        AnoAtual = calendario.get(Calendar.YEAR);
        HoraAtual = calendario.get(Calendar.HOUR_OF_DAY);
        //MinutoAtual = calendario.get(Calendar.MINUTE);
        //JOptionPane.showMessageDialog(null, "Dia.:"+DiaAtual+"\nMês.:"+MesAtual+"\nAno.:"+AnoAtual+"\nHorario.:"+HoraAtual+":"+MinutoAtual);
        
                
    }

    public int getDiaAtual() {
        return DiaAtual;
    }

    public void setDiaAtual(int DiaAtual) {
        this.DiaAtual = DiaAtual;
    }

    public int getMesAtual() {
        return MesAtual;
    }

    public void setMesAtual(int MesAtual) {
        this.MesAtual = MesAtual;
    }

    public int getAnoAtual() {
        return AnoAtual;
    }

    public void setAnoAtual(int AnoAtual) {
        this.AnoAtual = AnoAtual;
    }

    public int getHoraAtual() {
        return HoraAtual;
    }

    public void setHoraAtual(int HoraAtual) {
        this.HoraAtual = HoraAtual;
    }

    public int getMinutoAtual() {
        return MinutoAtual;
    }

    public void setMinutoAtual(int MinutoAtual) {
        this.MinutoAtual = MinutoAtual;
    }
}
