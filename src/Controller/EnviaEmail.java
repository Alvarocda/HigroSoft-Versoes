
package Controller;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

            //Ferramenta usada para enviar emais
            //http://www.devmedia.com.br/utilizando-a-api-commons-email-para-enviar-e-mails/3306
            //Commons Email, JavaMail API, Activation
            //activation: activation.jar (http://java.sun.com/products/archive/javabeans/jaf102.html)
            //commons-email-1.1: commons-email-1.1.jar (http://commons.apache.org/downloads/download_email.cgi)
            //javaMail: mail.jar (http://java.sun.com/products/javamail/downloads/index.html)
            //System.out.println(emailASerEnviado);
            //email.setDebug(true);


public class EnviaEmail {
    public static String emailUsuarioAtivo;
    public void EnviaEmail(){       
        String emailASerEnviado = getEmailUsuarioAtivo();
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            
            
            Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("notificacao.higrosoft@gmail.com", "fasipe2016");
                                   //Caso usarem outro email do Gmail, é nescessario acesasar esse link:
                                   //https://www.google.com/settings/security/lesssecureapps
                                   //E permitir que aplicativos não seguros acessem o email
                             }
                        });
            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("notificacao.higrosoft@gmail.com")); //Remetente
                  Address[] toUser = InternetAddress.parse(getEmailUsuarioAtivo());
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("HIGROSOFT - Falhas foram detectadas no seu sistema de irrigação");//Assunto
                  message.setText("Este é um email automatico, por favor NÃO RESPONDA\n"
                          + "Se você recebeu essa mensagem, por favor verifique imediatamente seu sistema de irrigação HigroSoft\n"
                          + "Falhas foram detectadas");                  
                  Transport.send(message);
                  //System.out.println("Feito!!!");

             } catch (MessagingException e) {
                  throw new RuntimeException(e);
            }
      
            
            
    }

    public String getEmailUsuarioAtivo() {
        return emailUsuarioAtivo;
    }

    public void setEmailUsuarioAtivo(String emailUsr) {
        emailUsuarioAtivo = emailUsr;
    }
    
    
}
