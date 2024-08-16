package InflearnJava.basic.poly.ex.pay1;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOpiton1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOpiton1, amount1);

        //naver결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 방식
        String payOption3 = "bed";
        int amount3 = 15000;
        payService.processPay(payOption3,amount3);
    }
}
