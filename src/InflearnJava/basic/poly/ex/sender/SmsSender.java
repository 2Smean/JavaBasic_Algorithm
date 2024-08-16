package InflearnJava.basic.poly.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms메세지를 발송합니다 " + message);
    }
}
