package HwangJava.Exception.Chapter6.MyCal;

import java.util.Calendar;

public class MyCal {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Calendar 는 new 로 생성하는 것이 아니라 getInstance 로 생성한다
        //현재 시간 정보로 초기화된 객체 생성

        now.set(Calendar.DAY_OF_MONTH, 30);//set을 이용해서 시간값을 바꿀 수 있다 default 는 현재 날짜, 시각

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH); //MONTH 는 0을 기준으로 하기 때문에 + 1 을 해줘야 실제 시간이 출력된다
        int day = now.get(Calendar.DAY_OF_MONTH);//MONTH 기준의 DAY
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);

        System.out.println(year + "." + month + "." + day + "."
                + hour + ":" + minute);
    }
}
