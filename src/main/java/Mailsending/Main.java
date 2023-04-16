package Mailsending;

public class Main {
    public static  void main(String[] args){
        System.out.println("This is suppose to send mail");
        Handle mailer=new Handle();
        mailer.sendMail();
    }
}
