package InflearnJava.basic.ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조할 곳을 할당
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
