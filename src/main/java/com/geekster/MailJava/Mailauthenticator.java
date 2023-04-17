package com.geekster.MailJava;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Mailauthenticator extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(Mailconstant.SENDER, "osksyrxlr******");
    }
}
