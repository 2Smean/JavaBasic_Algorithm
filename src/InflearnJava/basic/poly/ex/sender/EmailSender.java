package InflearnJava.basic.poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email을 발송합니다 " + message);
    }
}
