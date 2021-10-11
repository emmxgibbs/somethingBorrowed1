package User;

import com.sun.mail.util.MailSSLSocketFactory;
import User.UserDto;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class Sendmail implements Runnable {
    private String from = "1044902968@qq.com";
    private String username = "1044902968@qq.com";
    private String password = "ohvfjrjfoyvzbbed";


    private UserDto user;
    public Sendmail(UserDto user){
        this.user = user;
    }


    @Override
    public void run(){
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.host","smtp.qq.com");
            prop.setProperty("mail.transport.protocol","smtp");
            prop.setProperty("mail.stmp.auth","true");



            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            prop.put("mail.smtp.ssl.enable","true");
            prop.put("mail.smtp.ssl.socketFactory",sf);


            Session session = Session.getDefaultInstance(prop, new Authenticator(){
                public PasswordAuthentication getPasswordAuthentication(){

                    return new PasswordAuthentication(username,password);

                }
            });

            session.setDebug(true);
            Transport ts = session.getTransport();


            ts.connect("smtp.qq.com",username,password);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(user.getUsername()));
            message.setSubject("Welcome to team4 PHYT");
            message.setContent("<p><h2>Congratulations!</h2></p>"+user.getFull_name()+" <br> your register email is "+user.getUsername(),"text/html;charset=UTF-8");
            ts.sendMessage(message,message.getAllRecipients());
            ts.close();
        }catch (MessagingException e){
            e.printStackTrace();

        }catch (GeneralSecurityException e){
            e.printStackTrace();
        }
    }
}