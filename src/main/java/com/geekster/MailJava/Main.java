package com.geekster.MailJava;

public class Main {
    public static  void main(String[] args){
        System.out.println("This is suppose to send mail");
        HandleAttachment mailer=new HandleAttachment();
        mailer.sendMail();
    }
}
