package InflearnJava.basic.final1;

public class FieldInit {

    //바뀌지 않는 공용 변수
    static final int CONST_VALUE = 10; // static final 이 붙으면 상수, 관례에 따라 대문자로 작성
    final int value = 10;

//    public FieldInit(int value) { // 값이 초기화되어 있으면 생성자를 통해서 값 변경 불가
//        this.value = value;
//    }
}
