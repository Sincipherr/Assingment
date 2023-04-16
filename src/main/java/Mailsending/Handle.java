package Mailsending;

import com.geekster.WeeklyTest_16_4.CustomDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Handle {
    @Autowired
    @Qualifier("patient1")
    CustomDetails cd;
    void sendMail(){


        //host : gmail is smtp :
        String host  = "smtp.gmail.com";
        Properties props = System.getProperties();
        System.out.println(props);
        //set properties :
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable","true");
        props.put("mail.smtp.auth","true");
        //session
        Session mailSession = Session.getInstance(props,new MailAuth());
        //create the message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        try {
            //sender
            mimeMessage.setText(cd.getpatienstDetails().toString());
            mimeMessage.setFrom(MailConstant.SENDER);
            //receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstant.RECEIVERMAILADDRESS));
            //subject
            mimeMessage.setSubject(MailConstant.SUBJECT);
            mimeMessage.setText(MailConstant.MESSAGE);
            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
