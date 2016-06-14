
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;



public class EnviaEmail {
    public static String emailUsuarioAtivo;
    public void EnviaEmail(){        
        
        SimpleEmail email = new SimpleEmail();
        String emailASerEnviado = getEmailUsuarioAtivo();
        //System.out.println(emailASerEnviado);
        try {
            //Ferramenta usada para enviar emais
            //http://www.devmedia.com.br/utilizando-a-api-commons-email-para-enviar-e-mails/3306
            //Commons Email, JavaMail API, Activation
            //activation: activation.jar (http://java.sun.com/products/archive/javabeans/jaf102.html)
            //commons-email-1.1: commons-email-1.1.jar (http://commons.apache.org/downloads/download_email.cgi)
            //javaMail: mail.jar (http://java.sun.com/products/javamail/downloads/index.html)
            //System.out.println(emailASerEnviado);
            //email.setDebug(true);
            
            email.setHostName("smtp.gmail.com");
            //email.setSmtpPort(0);
            email.setAuthentication("notificacao.higrosoft@gmail.com","fasipe2016");
            email.setSSL(true);
            email.addTo(emailASerEnviado);
            email.setFrom("notificacao.higrosoft@gmail.com");
            email.setSubject("Falha detectada no sistema de irrigação HIGROSOFT");
            email.setMsg("Essa é uma mensagem automatica, por favor NÃO RESPONDA.\n"
                    + "Se você esta recebendo essa mensagem, por favor verifique seu sistema de irrigação HigroSoft.\n"
                    + "Falhas foram detectadas no equipamento.");           
            email.send();
            email.setDebug(true);
        } catch (EmailException ex) {
            Logger.getLogger(EnviaEmail.class.getName()).log(Level.SEVERE, null, ex);
            email.setDebug(true);
        }
        
    }

    public String getEmailUsuarioAtivo() {
        return emailUsuarioAtivo;
    }

    public void setEmailUsuarioAtivo(String emailUsr) {
        emailUsuarioAtivo = emailUsr;
    }
    
    
}
