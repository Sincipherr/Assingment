package Mailsending;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuth extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
//        return new PasswordAuthentication(MailConstant.SENDER,"lzdbkqcwryuwxxon");
    }
}
